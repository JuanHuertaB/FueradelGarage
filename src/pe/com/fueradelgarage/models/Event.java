package pe.com.fueradelgarage.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Event {

    private int id;
    private int idUser;
    private String nameEvent;
    private String start;
    private String end;
    private String place;
    private String description;

    public Event() {
    }

    public Event(int id, int idUser, String nameEvent, String start, String end, String place, String description) {
        this.id = id;
        this.idUser = idUser;
        this.nameEvent = nameEvent;
        this.start = start;
        this.end = end;
        this.place = place;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public Event setId(int id) {
        this.id = id;
        return this;
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

    public String getStart() {
        return start;
    }

    public Event setStart(String start) {
        this.start = start;
        return this;
    }

    public String getEnd() {
        return end;
    }

    public Event setEnd(String end) {
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
                    rs.getInt("id_events"),
                    rs.getInt("users_id"),
                    rs.getString("name_events"),
                    rs.getString("start_date"),
                    rs.getString("end_date"),
                    rs.getString("place"),
                    rs.getString("description"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
