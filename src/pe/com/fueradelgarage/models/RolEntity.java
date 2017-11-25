package pe.com.fueradelgarage.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RolEntity extends BaseEntity {

    public RolEntity(){
        super();
        setTableName("rol");
    }

    public RolEntity(Connection connection, String tableName){
        super(connection,tableName);
    }

    public Rol findById(int id){
        return findByCriteria(
                String.format("WHERE id = %d",id)).get(0);
    }

    public List<Rol> findByCriteria(String criteria){

        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                                    .concat(criteria));
            List<Rol> roles = new ArrayList<>();
            while (rs.next())
                roles.add(Rol.from(rs));

            return roles;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Rol> findAll(){
        return findByCriteria("");
    }

    public Rol create(Rol roles){
        return executeUpdate(String.format(
                "INSERT INTO %s(id,category) VALUES (%d,'%s')",
                getTableName(),roles.getId(),roles.getCategory()))?
                roles : null;
    }

    public Rol create(String category){
        return create(category);
    }

    public  boolean update(int id, String category){
        return executeUpdate(String.format(
                "UPDATE %s SET category = %s WHERE id = %d",getTableName(),category,id));
    }

    public boolean update(Rol roles){
        return update(roles.getId(),roles.getCategory());
    }

    public boolean erase(int id){
        return executeUpdate(String.format("DELETE FROM %s WHERE id=%d",
                getTableName(),id));
    }

    public boolean erase(Rol roles){
        return executeUpdate(String.format("DELETE FROM %s WHERE id=%d",
                getTableName(),roles.getId()));
    }

}
