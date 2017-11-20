package pe.com.fueradelgarage.models;

import java.sql.ResultSet;
import java.sql.SQLException;


public class User {

    private int id;
    private String name;
    private String firstName;
    private String lastName;
    private String password;
    private String description;
    private String video;
    private int score;

    public User(int id, String name, String firstName, String lastName, String password, String description, String video, int score) {
        this.id = id;
        this.name = name;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.description = description;
        this.video = video;
        this.score = score;
    }

    public User() {
    }

    public String getFirstName() {
        return firstName;
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getVideo() {
        return video;
    }

    public User setVideo(String video) {
        this.video = video;
        return this;
    }

    public int getId() {
        return id;
    }

    public User setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public User setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getScore() {
        return score;
    }

    public User setScore(int score) {
        this.score = score;
        return this;
    }

    public static User from(ResultSet rs) {
        try {
            return new User(
                    rs.getInt("id"),
                    rs.getString("user_name"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("password"),
                    rs.getString("description"),
                    rs.getString("video_url"),
                    rs.getInt("score"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
