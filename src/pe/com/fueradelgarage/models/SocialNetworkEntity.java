package pe.com.fueradelgarage.models;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SocialNetworkEntity extends BaseEntity{

    public SocialNetworkEntity(){
        super();
        setTableName("social_network");
    }

    public SocialNetworkEntity(Connection connection, String tableName){
        super(connection,tableName);
    }

    public SocialNetwork findById(int id){
        return findByCriteria(String.format("WHERE id_social_network = %d",getTableName(),id)).get(0);
    }

    public SocialNetwork findByUserId(int idUser){
        return findByCriteria(String.format("WHERE id_user = %d",getTableName(),idUser)).get(0);
    }

    public SocialNetwork create(SocialNetwork socialNetwork){
        return executeUpdate(String.format("INSERT INTO %s(name, url) VALUES('%s','%s',)", getTableName(),socialNetwork.getName(),socialNetwork.getUrl()))?
                socialNetwork :null;
    }

    public SocialNetwork create(String name, String url){
        return create(0,0,name,url);
    }

    public SocialNetwork create(int id, int idUser, String name,String url){
        return create(new SocialNetwork(id,idUser,name,url));
    }

    public boolean erase(int id){
        return executeUpdate(String.format(
                "DELETE FROM %s WHERE id = %d",getTableName(),id));
    }

    public boolean erase(SocialNetwork socialNetwork){
        return  executeUpdate(String.format("DELETE FROM %s WHERE id = %d",getTableName(),socialNetwork.getId()));
    }

    public boolean update (int id){
        return executeUpdate(String.format("UPDATE %s SET url = %s",getTableName(),id));
    }

    public boolean update (SocialNetwork socialNetwork){
        return executeUpdate(String.format("UPDATE %s SET name =%s",getTableName(),socialNetwork.getId()));
    }


    public List<SocialNetwork> findByCriteria(String criteria){

        try {
            ResultSet rs = getConnection()
                            .createStatement()
                            .executeQuery(getBaseStatement()
                                        .concat(criteria));
            List<SocialNetwork> socialNetworks = new ArrayList<>();
            while(rs.next())
                socialNetworks.add(SocialNetwork.from(rs));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
