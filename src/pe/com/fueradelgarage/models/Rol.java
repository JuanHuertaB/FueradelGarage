package pe.com.fueradelgarage.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Rol {

    private int id;
    private String category;

    public Rol() {
    }

    public Rol(int id, String category) {
        this.id = id;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public Rol setId(int id) {
        this.id = id;
        return this;
    }

    public String getCategory() {
        return category;
    }

    public Rol setCategory(String category) {
        this.category = category;
        return this;
    }

    public static Rol from(ResultSet rs) {
        try {
            return new Rol(
                    rs.getInt("id"),
                    rs.getString("category"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
