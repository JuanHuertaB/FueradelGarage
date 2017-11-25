package pe.com.fueradelgarage.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class GbService {
    private Connection connection;
    private GbDataStore dataStore;

    public GbService() {
        try {
            InitialContext context = new InitialContext();
            dataStore = new GbDataStore();
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

    public GbDataStore getDataStore() {
        return dataStore;
    }

    public void setDataStore(GbDataStore dataStore) {
        this.dataStore = dataStore;
    }

    // SERVICE USER
    public User findUserById(int id) {
        return dataStore.findUserById(id);
    }

    public List<User> findAllUsers() { return dataStore.findAllUsers(); }

    public User createUser(String name,String firstName,String lastName,String password,String description,String video, int score) {
        return dataStore.createUser(name,firstName,lastName,password,description,video,score);}

    public boolean updateUser(int id, String name,String firstName,String lastName, String password, String description,String video) {
        return dataStore.updateUser(id, name,firstName,lastName,password,description,video);
    }

}





