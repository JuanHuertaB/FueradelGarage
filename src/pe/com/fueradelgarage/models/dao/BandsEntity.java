package pe.com.fueradelgarage.models.dao;
import pe.com.fueradelgarage.models.dto.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//Exteniende de la clase padre para ApplicantEntity
//el cual extiende de su padre UserEntity
public class BandsEntity extends ApplicantsEntity {
    public BandsEntity(Connection connection,String tableName){
        super(connection,tableName);
        setTableName("bands");
    }
    public BandsEntity(){
        setTableName("bands");
    }
    public List<Band> findByCriteria(String criteria,ApplicantsEntity applicantsEntity,UsersEntity usersEntity){

        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                    .concat(criteria));
            List<Band> bands= new ArrayList<>();
            while (rs.next())
                bands.add(Band.from(rs,applicantsEntity,usersEntity));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Band findById(int id, ApplicantsEntity applicantsEntity,UsersEntity usersEntity){
        return findByCriteria(
                String.format("WHERE id_band = %d ", id),applicantsEntity,usersEntity).get(0);
    }

    public Applicant findByName(String name, UsersEntity usersEntity){
        return findByCriteria(
                String.format("WHERE name = '%s'",name),usersEntity).get(0);
    }

    public List<Applicant> findAll(UsersEntity usersEntity){
        return findByCriteria("",usersEntity);}

    public boolean create(Applicant applicant){
        return executeUpdate(String.format(
                "INSERT INTO %s(id_applicants,id_user,name,video_url) VALUES(%d,%d,'%s','%s')",
                getTableName(),applicant.getId(),applicant.getUser().getId(),applicant.getName(),applicant.getVideoUrl()));
    }

    public boolean create (int id,String name ,String videoUrl,User user){
        return create(new Applicant(id,name,videoUrl,user)); }

    public boolean update(int id,String name,String videoUrl,User user ){
        return executeUpdate(String.format(
                "UPDATE %s SET name = '%s',video_url='%s',id_user=%d WHERE id_applicants=%d",getTableName(),name,videoUrl,user,id ));
    }

    public boolean update (Applicant applicant ) {
        return update (applicant.getId(),
                applicant.getName(),applicant.getVideoUrl(),applicant.getUser());}

    public boolean erase (int id){
        return executeUpdate(String.format("DELETE FROM '%s' WHERE id_applicants = %d",
                getTableName(), id));
    }

    public boolean erase (Applicant applicant) {
        return executeUpdate(String.format("DELETE FROM %s WHERE id_applicants = %d",
                getTableName(), applicant.getId(),applicant.getUser()));}
}
