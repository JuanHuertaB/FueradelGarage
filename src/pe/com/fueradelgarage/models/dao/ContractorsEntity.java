package pe.com.fueradelgarage.models.dao;

import pe.com.fueradelgarage.models.dto.Contractor;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractorsEntity extends BaseEntity{

    public ContractorsEntity(){
        super();
        setTableName("");
    }

    public ContractorsEntity(Connection connection, String tableName){
        super(connection, tableName);}


    public List<Contractor> findByCriteria(String criteria){

        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                            .concat(criteria));
            List<Contractor> contractors = new ArrayList<>();
            while(rs.next())
                contractors.add(Contractor.from(rs));
            return contractors;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Contractor findById(int id){
        return findByCriteria(String.format(
                "WHERE id = '%s'", id)).get(0);
    }

    public Contractor findByName(String name){
        return findByCriteria(String.format(
                "WHERE name = '%s'", name)).get(0);
    }

    public List<Contractor> findAll(){return findByCriteria("");}

    public boolean create(Contractor contractor){
            return  executeUpdate(String.format(
                    "INSERT INTO '%s'(id,user_name,password,first_name,last_name,description,score,video_url) " +
                            "VALUES ('%s','%s','%s','%s','%s','%s','%d','%s')",
                            getTableName(),contractor.getId(),contractor.getUserName(),contractor.getPassword(),contractor.getFirstName(),contractor.getLastName(),contractor.getDescription(),contractor.getScore(),contractor.getVideoUrl()));
    }

    public boolean create(String id, String user,String password,String firstName, String lastName, String description, int score, String videoUrl){
        return create(new Contractor(id,password,user,firstName,lastName,description,score,videoUrl));}


    public boolean update(String id,String user_name, String password, String firstName,String lastName,String description, int score, String videoUrl){
        return executeUpdate(String.format(
                "UPDATE %s SET user_name = '%s', password = '%s',first_name ='%s',last_name = '%s', description = '%s',score = '%d', videoUrl = '%s'"));
    }

    public boolean update (Contractor contractor) {
        return update (contractor.getId(),
                contractor.getUserName(),contractor.getPassword(),contractor.getFirstName(),contractor.getLastName(),contractor.getDescription(),contractor.getScore(),contractor.getVideoUrl());}

    public boolean erase (String id){
        return executeUpdate(String.format("DELETE FROM '%s' WHERE id = '%s'",
                getTableName(), id));
    }

    public boolean erase (Contractor contractor) {
        return executeUpdate(String.format("DELETE FROM %s WHERE id = %s",
                getTableName(), contractor.getId()));}
}




