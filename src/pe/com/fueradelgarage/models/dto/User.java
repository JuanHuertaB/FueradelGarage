package pe.com.fueradelgarage.models.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User {

    private int id;
    private String name;
    private String password;
    private String description;
    private int score;

    public User() {
    }

    public User(int id, String name, String password, String description, int score) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.description = description;
        this.score = score;
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
                    rs.getString("password"),
                    rs.getString("description"),
                    rs.getInt("score"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
