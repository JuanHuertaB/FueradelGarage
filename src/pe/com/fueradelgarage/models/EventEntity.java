package pe.com.fueradelgarage.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EventEntity extends BaseEntity{

    public EventEntity(){
        super();
        setTableName("event");
    }

    public EventEntity(Connection connection, String tableName){
        super(connection,tableName);
    }

    public Event findById(int id){
        return findByCriteria(String.format("WHERE id_events = %d",id)).get(0);
    }

    public Event findByName(String name){
        return findByCriteria(
                String.format("WHERE nameEvents = '%s'",name)).get(0);
    }

    public List<Event> findAll(){
        return findByCriteria("");
    }

    public Event create(Event event){
        return executeUpdate(String.format(
                "INSERT INTO %s(name_event,start_date,end_date,place,description) VALUES ('%s','%s','%s','%s')",
                 getTableName(),event.getNameEvent(),event.getStartDate(),event.getEndDate(),event.getPlace(),event.getDescription()))?
                event : null;
    }

    public Event create(String nameEvent, Date startDate, Date endDate, String place, String description){
        return create(new Event(0,0, nameEvent , startDate, endDate, place,description));
    }

    public Event create(int id, int idContractor, String nameEvent, Date startDate, Date endDate, String place, String description ){
        return create (new Event(id, idContractor,nameEvent, startDate,endDate,place,description));
    }


    public boolean update(String nameEvent,Date startDate, Date endDate, String place, String description){
        return executeUpdate(String.format("UPDATE %s SET name_events = %s , start_date = %s, end_date = %s, place = %s, description = %s ",
                getTableName(),nameEvent,startDate,endDate,place,description));
    }

    public boolean update(Event event){
        return update(event.getNameEvent(),event.getStartDate(),event.getEndDate(),event.getPlace(),event.getDescription());
    }

    public boolean erase(int id){
        return executeUpdate(String.format("DELETE FROM %s WHERE id=%d",getTableName(),id));

    }

    public boolean erase(Event event){
        return executeUpdate(String.format("DELETE FROM %s WHERE id = %d",getTableName(),event.getId()));
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

}