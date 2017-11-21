package pe.com.fueradelgarage.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Offer {
    private int idOffers;
    private int idEvents;
    private String title;
    private String startTime;
    private String endTime;
    private String description;

    public Offer(int idOffers, int idEvents, String title, String startTime, String endTime, String description) {
        this.idOffers = idOffers;
        this.idEvents = idEvents;
        this.title = title;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
    }

    public Offer() {

    }

    public int getIdOffers() {
        return idOffers;
    }

    public Offer setIdOffers(int idOffers) {
        this.idOffers = idOffers;
        return this;
    }

    public int getIdEvents() {
        return idEvents;
    }

    public Offer setIdEvents(int idEvents) {
        this.idEvents = idEvents;
        return this;
    }


    public String getTitle() {
        return title;
    }

    public Offer setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getStartTime() {
        return startTime;
    }

    public Offer setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public String getEndTime() {
        return endTime;
    }

    public Offer setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Offer setDescription(String description) {
        this.description = description;
        return this;
    }
    public static Offer from(ResultSet rs) {
        try {
            return new Offer(
                    rs.getInt("id_offers"),
                    rs.getInt("id_events"),
                    rs.getString("title"),
                    rs.getString("start_time"),
                    rs.getString("end_time"),
                    rs.getString("description"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}

