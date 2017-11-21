package pe.com.fueradelgarage.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

public class EventService {
    private Connection connection;
    private EventDataStore dataStore;

    public EventService() {
        try {
            InitialContext context = new InitialContext();
            dataStore = new EventDataStore();
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

    public EventDataStore getDataStore() {
        return dataStore;
    }

    public void setDataStore(EventDataStore dataStore) {
        this.dataStore = dataStore;
    }

    // SERVICE EVENT
    public Event findEventById(int id) {
        return dataStore.findEventById(id);
    }

    public List<Event> findAllEvents() { return dataStore.findAllEvents(); }

    public Event createEvent(int idUser, String nameEvent, String start, String end,String place,String description) {
        return dataStore.createEvent(idUser,nameEvent,start,end,place,description);}

    public boolean updateEvent(int id, String nameEvent, String start, String end,String place,String description) {
        return dataStore.updateEvent(id, nameEvent,start,end,place,description);
    }

    public boolean eraseEvent(int id) {
        return dataStore.eraseEvent(id); }
}
