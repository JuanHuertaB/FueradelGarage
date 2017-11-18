package pe.com.fueradelgarage.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractorEntity extends BaseEntity {

    public ContractorEntity(Connection connection, String tableName) {
        super(connection, tableName);
    }

    public ContractorEntity() {
        super();
        setTableName("contractors");
    }

    public Contractor findById(int id, UsersEntity usersEntity) {
        return findByCriteria(
                String.format("WHERE country_id = %d", id), usersEntity).get(0);
    }

    public List<Contractor> findByCriteria(String criteria, UsersEntity usersEntity) {
        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                                    .concat(criteria));
            List<Contractor> contractors = new ArrayList<>();
            while(rs.next())
                contractors.add(Contractor.from(rs, usersEntity));

            return contractors;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public List<Contractor> findAll(UsersEntity usersEntity) {

        return findByCriteria("", usersEntity);
    }

    public boolean create(Contractor contractor) {
        return executeUpdate(String.format(
                "INSERT INTO %s(id_user, first_name, last_name, video_url) VALUES(%d, '%s', '%s', '%s' )",
                getTableName(), contractor.getUser().getId(), contractor.getFirstName(), contractor.getLastName(),contractor.getVideoUrl()));
    }

    public boolean create(User user,String name,String lastname,String video ) {
        return create(new Contractor(0,user, name, lastname,video));
    }

    public boolean update( String name, String lastName, String video, User user) {
        return executeUpdate(String.format(
                "UPDATE %s SET first_name = '%s', last_name = '%s', video_url = '%s' WHERE id_user = %d", getTableName(), name, lastName, video, user));
    }

    public boolean update(Contractor contractor) {
        return update(contractor.getFirstName(),contractor.getLastName(),contractor.getVideoUrl() ,contractor.getUser());
    }

    public boolean erase(int id) {
        return executeUpdate(String.format("DELETE FROM %s WHERE id_contractors = %d",
                getTableName(), id));
    }

    public boolean erase(Contractor contractor) {
        return executeUpdate(String.format("DELETE FROM %s WHERE id_contractors = %d",
                getTableName(), contractor.getId(), contractor.getUser()));
    }
}
