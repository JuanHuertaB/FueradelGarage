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

}
