package pe.com.fueradelgarage.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Member {

    private int id_member;
    private int id_applicants;
    private String name_me;
    private String position;

    public Member(int id_member, int id_applicants, String name_me, String position) {
        this.id_member = id_member;
        this.id_applicants = id_applicants;
        this.name_me = name_me;
        this.position = position;
    }

    public Member() {
    }

    public int getId_member() {
        return id_member;
    }

    public Member setId_member(int id_member) {
        this.id_member = id_member;
        return this;
    }

    public int getId_applicants() {
        return id_applicants;
    }

    public Member setId_applicants(int id_applicants) {
        this.id_applicants = id_applicants;
        return this;
    }

    public String getName_me() {
        return name_me;
    }

    public Member setName_me(String name_me) {
        this.name_me = name_me;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public Member setPosition(String position) {
        this.position = position;
        return this;
    }

    public static Member from(ResultSet rs) {
        try {
            return new Member(
                    rs.getInt("id_member"),
                    rs.getInt("id_applicants"),
                    rs.getString("name_me"),
                    rs.getString("position"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
