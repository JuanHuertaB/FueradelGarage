package pe.com.fueradelgarage.models.dao;

import pe.com.fueradelgarage.models.dto.Applicant;
import sun.security.krb5.internal.APOptions;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ApplicantsEntity extends BaseEntity{

    public ApplicantsEntity(Connection connection, String tableName){
        super(connection,tableName);
    }

    public ApplicantsEntity(){
        super();
        setTableName("applicants");
    }

    public List<Applicant> findByCriteria(String criteria){

        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                            .concat(criteria));
           List<Applicant> applicants = new ArrayList<>();
           while(rs.next())
               applicants.add(Applicant.from(rs));
            return applicants;

        } catch (SQLException e) {
            e.printStackTrace();
        }
          return null;
    }

    public Applicant findById(String id){
        return findByCriteria(
                String.format("WHERE id = '%s'", id)).get(0);
    }

    public Applicant findByName(String name){
        return findByCriteria(
                String.format("WHERE name = '%s'",name)).get(0);
    }

    public List<Applicant> findAll(){ return findByCriteria("");}

    public boolean create(Applicant applicant){
        return executeUpdate(String.format(
                "INSERT INTO %s(id,user,password,description,score,videoUrl) VALUES('%s','%s','%s','%s','%d','%s')",
                getTableName(),applicant.getId(),applicant.getUser(),applicant.getPassword(),applicant.getScore(),applicant.getVideoUrl()));
    }

    public boolean create (String id, String user, String password, String description, int score, String videoUrl){
            return create(new Applicant(id, user,password,description, score, videoUrl)); }

    public boolean update(String id,String user, String password, String description, int score, String videoUrl){
            return executeUpdate(String.format(
                    "UPDATE %s SET user = '%s', password = '%s', description = '%s',score = '%d', videoUrl = '%s'"));
    }

    public boolean update (Applicant applicant ) {
        return update (applicant.getId(),
                applicant.getUser(),applicant.getPassword(),applicant.getDescription(),applicant.getScore(),applicant.getVideoUrl());}

    public boolean erase (String id){
        return executeUpdate(String.format("DELETE FROM '%s' WHERE id = '%s'",
                getTableName(), id));
    }

    public boolean erase (Applicant applicant) {
        return executeUpdate(String.format("DELETE FROM %s WHERE id = %s",
            getTableName(), applicant.getId()));}

}
