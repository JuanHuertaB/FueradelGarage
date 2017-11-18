package pe.com.fueradelgarage.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Contractor {
    private int id;
    private User user;
    private String firstName;
    private String lastName;
    private String videoUrl;

    public Contractor() {
    }

    public Contractor(int id, User user, String firstName, String lastName, String videoUrl) {
        this.id = id;
        this.user = user;
        this.firstName = firstName;
        this.lastName = lastName;
        this.videoUrl = videoUrl;
    }

    public int getId() {
        return id;
    }

    public Contractor setId(int id) {
        this.id = id;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Contractor setUser(User user) {
        this.user = user;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Contractor setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Contractor setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public Contractor setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public static Contractor from(ResultSet rs, UsersEntity usersEntity) {
        Contractor contractor = new Contractor();
        try {
            return contractor.setId(rs.getInt("id_contractors"))
                    .setUser(usersEntity.findById(rs.getInt("id_user")))
                    .setFirstName(rs.getString("first_name"))
                    .setLastName(rs.getString("last_name"))
                    .setVideoUrl(rs.getString("video_url"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
