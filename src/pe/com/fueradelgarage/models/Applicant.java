package pe.com.fueradelgarage.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Applicant {

    private int idApplicants;
    private String name;
    private String videoUrl;
    private String password;
    private String description;
    private int rolId;
    private int score;

    public Applicant(int idApplicants, String name, String videoUrl, String password, String description, int rol_id, int score) {
        this.idApplicants = idApplicants;
        this.name = name;
        this.videoUrl = videoUrl;
        this.password = password;
        this.description = description;
        this.rolId = rolId;
        this.score = score;
    }

    public int getIdApplicants() {
        return idApplicants;
    }

    public Applicant setIdApplicants(int idApplicants) {
        this.idApplicants = idApplicants;
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

    public int getRolId() {
        return rolId;
    }

    public Applicant setRolId(int rolId) {
        this.rolId = rolId;
        return this;
    }

    public int getScore() {
        return score;
    }

    public Applicant setScore(int score) {
        this.score = score;
        return this;
    }

    public static Applicant from(ResultSet rs) {
        try {
            return new Applicant(
                    rs.getInt("id_applicants"),
                    rs.getString("name"),
                    rs.getString("video_url"),
                    rs.getString("password"),
                    rs.getString("description"),
                    rs.getInt("rol_id"),
                    rs.getInt("score"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
