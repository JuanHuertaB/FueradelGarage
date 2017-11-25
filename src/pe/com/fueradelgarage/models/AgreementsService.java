package pe.com.fueradelgarage.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class AgreementsService {
    private Connection connection;
    private AgreementsDataStore dataStore;

    public AgreementsService() {
        try {
            InitialContext context = new InitialContext();
            dataStore = new AgreementsDataStore();
            connection = ((DataSource) context
                    .lookup("MySQLDataSource"))
                    .getConnection();
            dataStore.setConnection(connection);
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public AgreementsDataStore getDataStore() {
        return dataStore;
    }

    public void setDataStore(AgreementsDataStore dataStore) {
        this.dataStore = dataStore;
    }

    // SERVICE AGREEMENTS
    public  Agreement findAgreementsById(int id) {
        return dataStore.findAgreementsById(id);
    }

    public List<Agreement> findAllAgreements() {
        return dataStore.findAllAgreements(); }

    public Agreement createAgreement(String state, String contractorsQualification, String applicantsQualification) {
        return dataStore.createAgreement(state,contractorsQualification,applicantsQualification);}

    public boolean updateAgreement(int idOffers, int idApplicants, String state) {
        return dataStore.updateAgreement(idOffers,idApplicants,state);
    }
    public boolean eraseAgreement(int id) {
        return dataStore.eraseAgreemet(id); }

}
