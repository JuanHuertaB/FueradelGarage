package pe.com.fueradelgarage.models.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Contractor {
    private String id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String description;
    private Integer score;
    private String videoUrl;

    public Contractor(String id, String userName, String password, String firstName, String lastName, String description, Integer score, String videoUrl) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.score = score;
        this.videoUrl = videoUrl;
    }

    public String getId() {
        return id;
    }

    public Contractor setId(String id) {
        this.id = id;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public Contractor setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Contractor setPassword(String password) {
        this.password = password;
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

    public String getDescription() {
        return description;
    }

    public Contractor setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getScore() {
        return score;
    }

    public Contractor setScore(Integer score) {
        this.score = score;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public Contractor setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public static Contractor from(ResultSet rs){
        //Contractor contractor = new Contractor();
        try {
            return new Contractor(rs.getString("id"),
                     rs.getString("userName"),
                     rs.getString("password"),
                     rs.getString("first_name"),
                     rs.getString("last_name"),
                     rs.getString("description"),
                     rs.getInt("score"),
                     rs.getString("videoUrl"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
