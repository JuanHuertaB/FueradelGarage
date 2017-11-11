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
                "INSERT INTO %s(id_user,name,video_url,rol_id) VALUES (%d,'%s','%s',%d)",
                getTableName(),applicant.getId_user(),applicant.getName(),applicant.getVideo_url(),applicant.getRol_id()))?
                applicant : null;
    }

    public Applicant create (int id_user, String name, String video_url, int rol_id){
        return create(0,id_user, name,video_url,rol_id);
    }

    public Applicant create (int id_applicants, int id_user, String name, String video_url, int rol_id){
        return create(new Applicant(id_applicants,id_user,name,video_url,rol_id));
    }

    // El usuario no actualiza update score
    // user no update score

    public  boolean update(int id_applicants, int id_user, String name, String video_url){
        return executeUpdate(String.format(
                "UPDATE %s SET id_user = %d, name = '%s', video_url = '%s' WHERE id_applicants = %d",getTableName(),id_user,name,video_url,id_applicants));
    }

    public boolean update(Applicant applicant){
        return update(applicant.getId_applicants(), applicant.getId_user(),applicant.getName(),applicant.getVideo_url());
    }

    public boolean erase(int id_applicants){
        return executeUpdate(String.format("DELETE FROM %s WHERE id_applicants=%d",
                getTableName(),id_applicants));
    }

    public boolean erase(Applicant applicant){
        return executeUpdate(String.format("DELETE FROM %s WHERE id_applicants=%d",
                getTableName(),applicant.getId_applicants()));
    }
}
