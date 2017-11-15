package pe.com.fueradelgarage.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersEntity extends BaseEntity{

    public UsersEntity(){
        super();
        setTableName("users");
    }

    public UsersEntity(Connection connection, String tableName )
    {
        super(connection, tableName);
    }

    public User findById(int id){
        return findByCriteria(
                String.format("WHERE id = %d",id)).get(0);
    }

    public List<User> findByCriteria(String criteria){

        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                                    .concat(criteria));
            List<User> users = new ArrayList<>();
            while (rs.next())
                users.add(User.from(rs));

            return users;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public User findByName(String name){
        return findByCriteria(
                String.format("WHERE user_name = '%s'",name)).get(0);
    }

    public List<User> findAll(){
        return findByCriteria("");
    }

    public User create(User user){
        return executeUpdate(String.format(
                "INSERT INTO %s(user_name,password,description,score) VALUES ('%s','%s','%s',%d)",
                getTableName(),user.getName(),user.getPassword(),user.getDescription(),user.getScore()))?
                user : null;
    }

    public User create (String name, String password, String description, int score){
        return create(0, name,password,description,score);
    }

    public User create (int id, String name, String password, String description, int score){
        return create(new User(id,name,password,description,score));
    }

    // El usuario no actualiza update score
    // user no update score

    public  boolean update(int id, String name, String password, String description){
        return executeUpdate(String.format(
                "UPDATE %s SET user_name = '%s', password = '%s', description = '%s' WHERE id = %d",getTableName(),name,password,description,id));
    }

    public boolean update(User user){
        return update(user.getId(),user.getName(),user.getPassword(),user.getDescription());
    }

    public boolean erase(int id){
        return executeUpdate(String.format("DELETE FROM %s WHERE id=%d",
                getTableName(),id));
    }

    public boolean erase(User user){
        return executeUpdate(String.format("DELETE FROM %s WHERE id=%d",
                getTableName(),user.getId()));
    }
}