package pe.com.fueradelgarage.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Member {

    private int idMember;
    private int idApplicants;
    private String nameMenber;
    private String position;

    public Member(int idMember, int idApplicants, String nameMenber, String position) {
        this.idMember = idMember;
        this.idApplicants = idApplicants;
        this.nameMenber = nameMenber;
        this.position = position;
    }

    public Member() {
    }

    public int getIdMember() {
        return idMember;
    }

    public Member setIdMember(int idMember) {
        this.idMember = idMember;
        return this;
    }

    public int getIdApplicants() {
        return idApplicants;
    }

    public Member setIdApplicants(int idApplicants) {
        this.idApplicants = idApplicants;
        return this;
    }

    public String getNameMenber() {
        return nameMenber;
    }

    public Member setNameMenber(String nameMenber) {
        this.nameMenber = nameMenber;
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
