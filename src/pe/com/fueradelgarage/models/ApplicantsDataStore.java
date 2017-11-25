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

    public Applicant createApplicant(int id_applicants, String name, String videoUrl, String password, String description, int rolId, int score) {
        return connection == null ?
                null :
                getApplicantsEntity().create(name,videoUrl,password,description,rolId,score);
    }


    public boolean updateApplicant(int idApplicant, String name, String video, String password, String description) {
        return connection == null ?
                false :
                getApplicantsEntity().update(idApplicant,name,video,password,description);
    }

    public boolean updateApplicant(Applicant applicant) {
        return updateApplicant(applicant.getIdApplicants(),applicant.getName(),applicant.getVideoUrl(),applicant.getPassword(),applicant.getDescription());
    }


    private ApplicantsEntity getApplicantsEntity() {
        if(applicantsEntity == null) {
            applicantsEntity = new ApplicantsEntity();
            applicantsEntity.setConnection(connection);
        }
        return applicantsEntity;
    }

}
