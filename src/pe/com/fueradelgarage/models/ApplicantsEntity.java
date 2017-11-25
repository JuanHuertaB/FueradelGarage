package pe.com.fueradelgarage.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ApplicantsEntity extends BaseEntity{
    public ApplicantsEntity(){
        super();
        setTableName("applicants");
    }

    public ApplicantsEntity(Connection connection, String tableName ){
        super(connection, tableName);
    }

    public Applicant findById(int id_applicants){
        return findByCriteria(
                String.format("WHERE id_applicants = %d",id_applicants)).get(0);
    }

    public List<Applicant> findByCriteria(String criteria){

        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                                    .concat(criteria));
            List<Applicant> applicants = new ArrayList<>();
            while (rs.next())
                applicants.add(Applicant.from(rs));

            return applicants;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Applicant findByName(String name){
        return findByCriteria(
                String.format("WHERE name = '%s'",name)).get(0);
    }

    public List<Applicant> findAll(){
        return findByCriteria("");
    }

    public Applicant create(Applicant applicant){
        return executeUpdate(String.format(
                "INSERT INTO %s(name,video_url,password,description,rol_id,score) VALUES (%s,'%s','%s',%d,%d)",
                getTableName(),applicant.getName(),applicant.getVideoUrl(),applicant.getPassword(),applicant.getDescription(),applicant.getRolId(),applicant.getScore()))?
                applicant : null;
    }

    public Applicant create (String name, String videoUrl, String password, String description, int rolId, int score){
        return create(0,name,videoUrl,password,description,rolId,score);
    }

    public Applicant create (int id_applicants, String name, String videoUrl, String password, String description, int rolId, int score) {
        return create(new Applicant(id_applicants, name, videoUrl, password, description, rolId, score));
    }

    // El usuario no actualiza update score
    // user no update score

    public  boolean update(int idApplicant, String name, String video, String password, String description){
        return executeUpdate(String.format(
                "UPDATE %s SET name = '%s', video_url = '%s',password='%s',description='%s', WHERE id_applicants = %d",getTableName(),name,video,password,description,idApplicant));
    }

    public boolean update(Applicant applicant){
        return update(applicant.getIdApplicants(), applicant.getName(),applicant.getVideoUrl(),applicant.getPassword(),applicant.getDescription());
    }

    public boolean erase(int idApplicants){
        return executeUpdate(String.format("DELETE FROM %s WHERE id_applicants=%d",
                getTableName(),idApplicants));
    }

    public boolean erase(Applicant applicant){
        return executeUpdate(String.format("DELETE FROM %s WHERE id_applicants=%d",
                getTableName(),applicant.getIdApplicants()));
    }
}
