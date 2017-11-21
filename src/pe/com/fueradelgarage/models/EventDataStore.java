package pe.com.fueradelgarage.models;

import java.sql.Connection;
import java.util.Date;
import java.util.List;

public class EventDataStore {
    private Connection connection;
    private EventsEntity eventsEntity;

    public EventDataStore(Connection connection) {
        this.connection = connection;
    }

    public EventDataStore() {
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    //EVENTS
    private EventsEntity getEventsEntity() {
        if(eventsEntity == null) {
            eventsEntity = new EventsEntity();
            eventsEntity.setConnection(connection);
        }
        return eventsEntity;
    }

    public Event findEventById(int id) {
        if(connection == null) return null;
        return getEventsEntity().findById(id);
    }

    public List<Event> findAllEvents() {
        return connection == null ? null: getEventsEntity().findAll();
    }

    public Event createEvent(int idUser, String nameEvent, String start, String end, String place, String description) {
        return connection == null ?
                null :
                getEventsEntity().create(idUser,nameEvent,start,end,place,description);
    }

    public boolean updateEvent(int id, String nameEvent, String start, String end,String place,String description) {
        return connection == null ?
                false :
                getEventsEntity().update(id, nameEvent,start,end,place,description);
    }

    public boolean updateEvent(Event event) {
        return updateEvent(event.getId(), event.getNameEvent(),event.getStart(),event.getEnd(), event.getPlace(), event.getDescription());
    }

    public boolean eraseEvent(int id) {
        return connection == null ?
                false :
                getEventsEntity().erase(id);
    }
}
