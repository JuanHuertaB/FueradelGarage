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

    public User findUserById(int id) {
        return dataStore.findUserById(id);
    }

    public List<User> findAllUsers() { return dataStore.findAllUsers(); }

    public User createUser(String name,String password,String description, int score) {
        return dataStore.createUser(name,password,description,score);}

    public boolean updateUser(int id, String name, String password, String description) {
        return dataStore.updateUser(id, name,password,description);
    }
<<<<<<< HEAD
<<<<<<< HEAD
    public boolean eraseUser(int id) {
        return dataStore.eraseUser(id); }

    public List<Agreement> findAllAgreements() {
        return null;
    }

    public Agreement findAgreementsById(int id) {
        return null;
    }
=======
=======
>>>>>>> Develop_new
    public boolean eraseUser(int id) { return dataStore.eraseUser(id); }

    public Event findEventById(int id ){return dataStore.findEventById(id);}

    public List<Event> findAllEvents() { return dataStore.findAllEvents(); }

    public boolean eraseEvent(int id) {return dataStore.eraseEvent();}

    public Event createEvent(String name, String password, String description, int score) {
    return dataStore.createEvent(name, password,description,score);}

    public boolean updateEvent(int id, String name, String password, String description) {
    return dataStore.updateEvent(id,name,password,description);}
<<<<<<< HEAD
>>>>>>> Develop_new
=======
=======

    public boolean eraseUser(int id) {
        return dataStore.eraseUser(id); }


>>>>>>> jhonatandev
>>>>>>> Develop_new
}





