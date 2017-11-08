package pe.com.fueradelgarage.models.others;

import pe.com.fueradelgarage.models.dto.Applicant;
import pe.com.fueradelgarage.models.dto.User;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.plaf.synth.Region;
import java.sql.Connection;
import java.util.List;

public class Service {
    private Connection connection;
    private DataStore dataStore;

    public Service(){
        try {
            InitialContext context= new InitialContext();
            dataStore= new DataStore();
            connection = ((DataStore) context
            .lookup("MySQLDataSource"))
                    .getConnection();
        } catch (NamingException e) {
            e.printStackTrace();
        }

    }

    public Connection getConnection() {
        return connection;
    }
    public void setConnection(Connection connection){
        this.connection=connection;
    }

    public DataStore getDataStore() {
        return dataStore;
    }
    public void setDataStore(DataStore dataStore){
        this.dataStore=dataStore;
    }
    public User findUserById(int id) {
        return dataStore.findUserById(id);
    }
    public List<User> findAllUsers(){
        return dataStore.findAllUsers();
    }
    public List<Applicant> findAllApplicants(){
        return  dataStore.findAllApplicants();
    }
    public User createUser(String user,String password,String description,int score){
        return dataStore.createUser(user,password,description,score);
    }
    public boolean updateUser(int id, String name, String password, String description){
    return dataStore.updateUser(id,name,password,description);
    }
}
