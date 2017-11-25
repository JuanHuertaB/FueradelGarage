package pe.com.fueradelgarage.models;

import java.sql.Connection;
import java.util.List;

public class AgreementsDataStore {
    private Connection connection;
    private AgreementsEntity agreementsEntity;

    public AgreementsDataStore(Connection connection) {
        this.connection = connection;
    }

    public AgreementsDataStore() {
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Agreement findAgreementsById(int id) {
        if(connection == null) return null;
        return getAgreementsEntity().findById(id);
    }

    public List<Agreement> findAllAgreements() {
        return connection == null ? null: getAgreementsEntity().findAll();
    }

    public Agreement createAgreement( String state, String contractorsQualification, String applicantsQualification) {
        return connection == null ?
                null :
                getAgreementsEntity().create(state,contractorsQualification,applicantsQualification);
    }

    public boolean updateAgreement(int idOffers, int idApplicants, String state) {
        return connection == null ?
                false :
                getAgreementsEntity().update(idOffers,idApplicants,state);
    }

    public boolean updateAgreement(Agreement agreement) {
        return updateAgreement(agreement.getIdOffers(),agreement.getIdApplicants(),agreement.getState());
    }

    public boolean eraseAgreemet(int id) {
        return connection == null ?
                false :
                getAgreementsEntity().erase(id);
    }

    private AgreementsEntity getAgreementsEntity() {
        if(agreementsEntity == null) {
            agreementsEntity = new AgreementsEntity();
            agreementsEntity.setConnection(connection);
        }
        return agreementsEntity;
    }

}
