package pe.com.fueradelgarage.models.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Applicant {
    private String id;
    private String user;
    private String password;
    private String description;
    private int score;
    private String videoUrl;

    public Applicant(String id, String user, String password, String description, int score, String videoUrl) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.description = description;
        this.score = score;
        this.videoUrl = videoUrl;
    }

    public String getId() {
        return id;
    }

    public Applicant setId(String id) {
        this.id = id;
        return this;
    }

    public String getUser() {
        return user;
    }

    public Applicant setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Applicant setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Applicant setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getScore() {
        return score;
    }

    public Applicant setScore(int score) {
        this.score = score;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public Applicant setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public static Applicant from(ResultSet rs){

        try {
            return  new Applicant(rs.getString("id"),
                                  rs.getString("user"),
                                  rs.getString("password"),
                                  rs.getString("description"),
                                  rs.getInt("score"),
                                  rs.getString("videoUrl"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
