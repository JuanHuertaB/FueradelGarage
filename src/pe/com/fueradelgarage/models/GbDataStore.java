package pe.com.fueradelgarage.models;

import java.sql.Connection;
import java.util.List;

public class GbDataStore {
    private Connection connection;
    private UsersEntity usersEntity;


    public GbDataStore(Connection connection) {
        this.connection = connection;
    }

    public GbDataStore() {
    }

    public User findUserById(int id) {
        if(connection == null) return null;
        return getUsersEntity().findById(id);
    }

    public List<User> findAllUsers() {
        return connection == null ? null: getUsersEntity().findAll();
    }

    public User createUser(String name,String password,String description, int score) {
        return connection == null ?
                null :
                getUsersEntity().create(name,password,description,score);
    }

    public boolean updateUser(int id, String name,String password,String description) {
        return connection == null ?
                false :
                getUsersEntity().update(id, name,password,description);
    }

    public boolean updateUser(User user) {
        return updateUser(user.getId(), user.getName(), user.getPassword(), user.getDescription());
    }

    public boolean eraseUser(int id) {
        return connection == null ?
                false :
                getUsersEntity().erase(id);
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    private UsersEntity getUsersEntity() {
        if(usersEntity == null) {
            usersEntity = new UsersEntity();
            usersEntity.setConnection(connection);
        }
        return usersEntity;
    }

}






