package pe.com.fueradelgarage.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ApplicantsService {
    private Connection connection;
    private ApplicantsDataStore dataStore;

    public ApplicantsService() {
        try {
            InitialContext context = new InitialContext();
            dataStore = new ApplicantsDataStore();
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

    public ApplicantsDataStore getDataStore() {
        return dataStore;
    }

    public void setDataStore(ApplicantsDataStore dataStore) {
        this.dataStore = dataStore;
    }

    // SERVICE APPLICANT
    public  Applicant findApplicantsById(int id) {
        return dataStore.findApplicantsById(id);
    }

    public List<Applicant> findAllApplicants() { return dataStore.findAllApplicants(); }

    public Applicant createUser(String name, String video, String password, String description,int rol,int score) {
        return dataStore.createApplicant(name,video,password,description,rol,score);}

    public boolean updateUser(int idApplicant, String name, String video, String password, String description) {
        return dataStore.updateApplicant(idApplicant,name,video,password,description);
    }
    public boolean eraseUser(int id) {
        return dataStore.eraseUser(id); }

}
