package pe.com.fueradelgarage.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Event {

    private int idUser;
    private String nameEvent;
    private Date start;
    private Date end;
    private String place;
    private String description;

    public Event() {
    }

    public Event(int idUser, String nameEvent, Date start, Date end, String place, String description) {
        this.idUser = idUser;
        this.nameEvent = nameEvent;
        this.start = start;
        this.end = end;
        this.place = place;
        this.description = description;
    }

    public int getIdUser() {
        return idUser;
    }

    public Event setIdUser(int idUser) {
        this.idUser = idUser;
        return this;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public Event setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
        return this;
    }

    public Date getStart() {
        return start;
    }

    public Event setStart(Date start) {
        this.start = start;
        return this;
    }

    public Date getEnd() {
        return end;
    }

    public Event setEnd(Date end) {
        this.end = end;
        return this;
    }

    public String getPlace() {
        return place;
    }

    public Event setPlace(String place) {
        this.place = place;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Event setDescription(String description) {
        this.description = description;
        return this;
    }

    public static Event from(ResultSet rs) {
        try {
            return new Event(
                    rs.getInt("user_id"),
                    rs.getString("name_events"),
                    rs.getDate("start_date"),
                    rs.getDate("end_date"),
                    rs.getString("place"),
                    rs.getString("description"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
