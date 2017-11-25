package pe.com.fueradelgarage.models;

import java.sql.Connection;
import java.util.List;

public class RolDataStore {
    private RolEntity rolEntity;
    private Connection connection;

    public RolDataStore(Connection connection) {
        this.connection = connection;
    }

    public RolDataStore() {
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public Rol findRolById(int id){
        if (connection==null) return null;
        return getRolsEntity().findById(id);
    }

    public List<Rol> findAllRols(){
        return connection == null ? null: getRolsEntity().findAll();
    }

    public Rol createRol(int id , String categoria){
        return connection == null ?
                null: getRolsEntity().create(categoria);
    }

    public boolean updateRol(int id, String categoria){
        return connection == null?
                false :
                getRolsEntity().update(id,categoria);
    }

    public boolean eraseRol(int id){
        return connection == null?
                false:
                getRolsEntity().erase(id);
    }

    private RolEntity getRolsEntity() {
        if(rolEntity == null){
            rolEntity = new RolEntity();
            rolEntity.setConnection(connection);
        }
        return rolEntity;
    }

}
