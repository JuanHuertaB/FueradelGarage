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

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    //USER

    public User findUserById(int id) {
        if(connection == null) return null;
        return getUsersEntity().findById(id);
    }

    public List<User> findAllUsers() {
        return connection == null ? null: getUsersEntity().findAll();
    }

    public User createUser(String name,String firstName,String lastName,String password,String description,String video, int score) {
        return connection == null ?
                null :
                getUsersEntity().create(name,firstName,lastName,password,description,video,score);
    }

    public boolean updateUser(int id, String name, String firstName, String lastName,String password,String description,String video) {
        return connection == null ?
                false :
                getUsersEntity().update(id, name,firstName,lastName,password,description,video);
    }

    public boolean updateUser(User user) {
        return updateUser(user.getId(), user.getName(),user.getFirstName(),user.getLastName(), user.getPassword(), user.getDescription(),user.getVideo());
    }

    public boolean eraseUser(int id) {
        return connection == null ?
                false :
                getUsersEntity().erase(id);
    }

    private UsersEntity getUsersEntity() {
        if(usersEntity == null) {
            usersEntity = new UsersEntity();
            usersEntity.setConnection(connection);
        }
        return usersEntity;
    }

<<<<<<< HEAD

    public Event findEventById(int id) {
        return null;
    }

    public List<Event> findAllEvents() {
        return null;
    }

    public boolean eraseEvent() {
        return false;
    }

    public Event createEvent(String name, String password, String description, int score) {
            return null;
    }

    public boolean updateEvent(int id, String name, String password, String description) {
        return false;
    }

    //CONTRACTORS
    private ContractorEntity getContractorEntity() {
        if(contractorEntity == null) {
            contractorEntity = new ContractorEntity();
            contractorEntity.setConnection(connection);
        }
        return contractorEntity;
    }

    public Contractor findCountryById(int id) {
        if(connection == null) return null;
        return getContractorEntity().findById(id, getUsersEntity());
    }

    public List<Contractor> findAllContractor() {
        return connection == null ? null : getContractorEntity().findAll(getUsersEntity()); }

=======
>>>>>>> jhonatandev
}






