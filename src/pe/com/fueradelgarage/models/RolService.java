package pe.com.fueradelgarage.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class RolService {
    private Connection connection;
    private RolDataStore dataStore;

    public RolService(){

        InitialContext context = null;
        try {
            context = new InitialContext();
            dataStore = new RolDataStore();
            connection = ((DataSource) context
                    .lookup("MySQLDataSource"))
                    .getConnection();
            dataStore.setConnection(connection);

        } catch (NamingException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConnection(){
        return connection;
    }

    public void setConnection(Connection connection){
        this.connection = connection;
    }

    public RolDataStore getDataStore() {
        return dataStore;
    }

    public void setDataStore(RolDataStore dataStore){
        this.dataStore = dataStore;
    }

    public Rol findRolById(int id){
        return dataStore.findRolById(id);
    }
    public List<Rol> findAllRols() { return dataStore.findAllRols(); }

    public Rol createRol(int id, String description) {
        return dataStore.createRol(id,description);}

    public boolean updateRol(int id, String categoria) {
        return dataStore.updateRol(id,categoria);
    }

    public boolean eraseRol(int id) {
        return dataStore.eraseRol(id); }

}
