package pe.com.fueradelgarage.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SocialNetwork {
    private int id;
    private int idUser;
    private String name;
    private String url;

    public SocialNetwork(int id, int idUser, String name, String url) {
        this.id = id;
        this.idUser = idUser;
        this.name = name;
        this.url = url;
    }

    public int getId() {
        return id;
    }

    public SocialNetwork setId(int id) {
        this.id = id;
        return this;
    }

    public int getIdUser() {
        return idUser;
    }

    public SocialNetwork setIdUser(int idUser) {
        this.idUser = idUser;
        return this;
    }

    public String getName() {
        return name;
    }

    public SocialNetwork setName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public SocialNetwork setUrl(String url) {
        this.url = url;
        return this;
    }

    public static SocialNetwork from(ResultSet rs){

        try {
            return new SocialNetwork(
                    rs.getInt("id"),
                    rs.getInt("id_user"),
                    rs.getString("name"),
                    rs.getString("url"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
