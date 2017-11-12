package pe.com.fueradelgarage.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Offer {
    private int id_offers;
    private int id_events;
    private String title;
    private String start_time;
    private String end_time;
    private String description;

    public Offer(int id_offers, int id_events, String title, String start_time, String end_time, String description) {
        this.id_offers = id_offers;
        this.id_events = id_events;
        this.title = title;
        this.start_time = start_time;
        this.end_time = end_time;
        this.description = description;
    }

    public Offer() {
    }

    public int getId_offers() {
        return id_offers;
    }

    public Offer setId_offers(int id_offers) {
        this.id_offers = id_offers;
        return this;
    }

    public int getId_events() {
        return id_events;
    }

    public Offer setId_events(int id_events) {
        this.id_events = id_events;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Offer setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getStart_time() {
        return start_time;
    }

    public Offer setStart_time(String start_time) {
        this.start_time = start_time;
        return this;
    }

    public String getEnd_time() {
        return end_time;
    }

    public Offer setEnd_time(String end_time) {
        this.end_time = end_time;
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

