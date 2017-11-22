package pe.com.fueradelgarage.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Applicant {

    private int idApplicants;
    private String name;
    private String video;
    private String password;
    private String description;
    private int rol_id;
    private int score;

    public Applicant(int idApplicants, String name, String video, String password, String description, int rol_id, int score) {
        this.idApplicants = idApplicants;
        this.name = name;
        this.video = video;
        this.password = password;
        this.description = description;
        this.rol_id = rol_id;
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

    public String getVideo() {
        return video;
    }

    public Applicant setVideo(String video) {
        this.video = video;
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

    public int getRol_id() {
        return rol_id;
    }

    public Applicant setRol_id(int rol_id) {
        this.rol_id = rol_id;
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
                    rs.getInt("id_user"),
                    rs.getString("name"),
                    rs.getString("video_url"),
                    rs.getInt("rol_id"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
