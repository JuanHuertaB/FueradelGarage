package pe.com.fueradelgarage.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Event {
    private int id;
    private int idContractor;
    private String nameEvent;
    private Date startDate;
    private Date endDate;
    private String place;
    private String description;

    public Event(int id, int idContractor, String nameEvent, Date startDate, Date endDate, String place, String description) {
        this.id = id;
        this.idContractor = idContractor;
        this.nameEvent = nameEvent;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public int getIdContractor() {
        return idContractor;
    }

    public Event setIdContractor(int idContractor) {
        this.idContractor = idContractor;
        return this;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public Event setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Event setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Event setEndDate(Date endDate) {
        this.endDate = endDate;
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

    public static Event from(ResultSet rs){
        try {
            return new Event(
                    rs.getInt("id_events"),
                    rs.getInt("id_contractor"),
                    rs.getString("name_event"),
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
