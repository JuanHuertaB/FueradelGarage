package pe.com.fueradelgarage.models.dao;

import pe.com.fueradelgarage.models.dto.Applicant;
import pe.com.fueradelgarage.models.dto.User;
import sun.security.krb5.internal.APOptions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ApplicantsEntity extends BaseEntity{

    public ApplicantsEntity(Connection connection, String tableName){
        super(connection,tableName);
        setTableName("aplicants");
    }

    public ApplicantsEntity(){
        setTableName("applicants");
    }

    public List<Applicant> findByCriteria(String criteria, UsersEntity usersEntity){

        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                            .concat(criteria));
           List<Applicant> applicants = new ArrayList<>();
           while(rs.next())
               applicants.add(Applicant.from(rs,usersEntity));
            return applicants;

        } catch (SQLException e) {
            e.printStackTrace();
        }
          return null;
    }

    public Applicant findById(int id,UsersEntity usersEntity){
        return findByCriteria(
                String.format("WHERE id_applicants = %d ", id),usersEntity).get(0);
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
