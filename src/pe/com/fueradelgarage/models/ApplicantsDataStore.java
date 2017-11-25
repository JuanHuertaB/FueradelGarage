package pe.com.fueradelgarage.models;

import java.sql.Connection;
import java.util.List;

public class ApplicantsDataStore {
    private Connection connection;
    private ApplicantsEntity applicantsEntity;

    public ApplicantsDataStore(Connection connection) {
        this.connection = connection;
    }

    public ApplicantsDataStore() {
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Applicant findUserById(int id) {
        if(connection == null) return null;
        return getApplicantsEntity().findById(id);
    }

    public List<Applicant> findAllApplicants() {
        return connection == null ? null: getApplicantsEntity().findAll();
    }

    public Applicant createApplicant(int id_applicants, String name, String videoUrl, String password, String description, int rolId, int score) {
        return connection == null ?
                null :
                getApplicantsEntity().create(name,videoUrl,password,description,rolId,score);
    }

  /*  public boolean updateUser(int id, String name, String firstName, String lastName,String password,String description,String video) {
        return connection == null ?
                false :
                getUserEntity().update(id, name,firstName,lastName,password,description,video);
    }*/

   /* public boolean updateUser(User user) {
        return updateUser(user.getId(), user.getName(),user.getFirstName(),user.getLastName(), user.getPassword(), user.getDescription(),user.getVideo());
    }*/

  /*  public boolean eraseUser(int id) {
        return connection == null ?
                false :
                getApplicantsEntity().erase(id);
    }*/

    private ApplicantsEntity getApplicantsEntity() {
        if(applicantsEntity == null) {
            applicantsEntity = new ApplicantsEntity();
            applicantsEntity.setConnection(connection);
        }
        return applicantsEntity;
    }

}
