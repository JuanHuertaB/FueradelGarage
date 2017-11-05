package pe.com.fueradelgarage.models.dto;

import pe.com.fueradelgarage.models.dao.UsersEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Applicant {
    private int id;
    private String name;
    private String videoUrl;
    private User user;

    public Applicant() {
    }

    public Applicant(int id, String name, String videoUrl, User user) {
        this.id = id;
        this.name = name;
        this.videoUrl = videoUrl;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public Applicant setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Applicant setName(String name) {
        this.name = name;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public Applicant setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Applicant setUser(User user) {
        this.user = user;
        return this;
    }

    public static Applicant from(ResultSet rs, UsersEntity usersEntity){
        Applicant applicant = new Applicant();
        try {
            return applicant.setId(rs.getInt("id_applicants"))
                    .setName(rs.getString("name"))
                    .setVideoUrl(rs.getString("video_url"))
                    .setUser(usersEntity.findById(rs.getInt("id")));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
