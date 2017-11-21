package pe.com.fueradelgarage.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EventsEntity extends BaseEntity {

    public EventsEntity(){
        super();
        setTableName("events");
    }

    public EventsEntity(Connection connection, String tableName )
    {
        super(connection, tableName);
    }

    public Event findById(int id){
        return findByCriteria(
                String.format("WHERE id_events = %d",id)).get(0);
    }

    public List<Event> findByCriteria(String criteria){

        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                                    .concat(criteria));
            List<Event> events = new ArrayList<>();
            while (rs.next())
                events.add(Event.from(rs));

            return events;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Event> findAll(){
        return findByCriteria("");
    }

    public Event create(Event event){
        return executeUpdate(String.format(
                "INSERT INTO %s(user_id,name_events,start_date,end_date,place,description) VALUES (%d,'%s','%s','%s','%s','%s')",
                getTableName(),event.getIdUser(),event.getNameEvent(),event.getStart(),event.getEnd(),event.getPlace(),event.getDescription()))?
                event : null;
    }

    public Event create (int idUser, String nameEvent, String start, String end, String place, String description){
        return create(0,idUser, nameEvent,start,end,place,description);
    }

    public Event create (int id,int idUser, String nameEvent, String start, String end, String place, String description){
        return create(new Event(id,idUser,nameEvent,start,end,place,description));
    }

    public  boolean update(int id, String nameEvent,String start,String end, String place, String description){
        return executeUpdate(String.format(
                "UPDATE %s SET name_events = '%s',start_date = '%s',end_date = '%s', place = '%s', description = '%s' WHERE id = %d",getTableName(),nameEvent,start,end,place,description,id));
    }

    public boolean update(Event event){
        return update(event.getId(),event.getNameEvent(),event.getStart(),event.getEnd(),event.getPlace(),event.getDescription());
    }

    public boolean erase(int id){
        return executeUpdate(String.format("DELETE FROM %s WHERE id_events=%d",
                getTableName(),id));
    }

    public boolean erase(Event event){
        return executeUpdate(String.format("DELETE FROM %s WHERE id_events=%d",
                getTableName(),event.getId()));
    }

}
