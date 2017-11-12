package pe.com.fueradelgarage.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Applicant {

    private int id_applicants;
    private int id_user;
    private String name;
    private String video_url;
    private int rol_id;

    public Applicant(int id_applicants, int id_user, String name, String video_url, int rol_id) {
        this.id_applicants = id_applicants;
        this.id_user = id_user;
        this.name = name;
        this.video_url = video_url;
        this.rol_id = rol_id;
    }

    public Applicant() {
    }

    public int getId_applicants() {
        return id_applicants;
    }

    public Applicant setId_applicants(int id_applicants) {
        this.id_applicants = id_applicants;
        return this;
    }

    public int getId_user() {
        return id_user;
    }

    public Applicant setId_user(int id_user) {
        this.id_user = id_user;
        return this;
    }

    public String getName() {
        return name;
    }

    public Applicant setName(String name) {
        this.name = name;
        return this;
    }

    public String getVideo_url() {
        return video_url;
    }

    public Applicant setVideo_url(String video_url) {
        this.video_url = video_url;
        return this;
    }

    public int getRol_id() {
        return rol_id;
    }

    public Applicant setRol_id(int rol_id) {
        this.rol_id = rol_id;
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
