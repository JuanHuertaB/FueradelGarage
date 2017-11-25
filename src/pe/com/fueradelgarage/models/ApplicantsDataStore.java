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

    public Applicant findApplicantsById(int id) {
        if(connection == null) return null;
        return getApplicantsEntity().findById(id);
    }

    public List<Applicant> findAllApplicants() {
        return connection == null ? null: getApplicantsEntity().findAll();
    }

    public Applicant createApplicant( String name, String video, String password, String description,int rol,int score) {
        return connection == null ?
                null :
                getApplicantsEntity().create(name,video,password,description,rol,score);
    }

    public boolean updateApplicant(int idApplicant, String name, String video, String password, String description) {
        return connection == null ?
                false :
                getApplicantsEntity().update(idApplicant,name,video,password,description);
    }

    public boolean updateApplicant(Applicant applicant) {
        return updateApplicant(applicant.getIdApplicants(),applicant.getName(),applicant.getVideo(),applicant.getPassword(),applicant.getDescription());
    }

    public boolean eraseUser(int id) {
        return connection == null ?
                false :
                getApplicantsEntity().erase(id);
    }

    private ApplicantsEntity getApplicantsEntity() {
        if(applicantsEntity == null) {
            applicantsEntity = new ApplicantsEntity();
            applicantsEntity.setConnection(connection);
        }
        return applicantsEntity;
    }

}
