package pe.com.fueradelgarage.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Agreement {

    private int id_offers;
    private int id_applicants;
    private String state;
    private String contractors_qualification;
    private String applicants_qualification;

    public Agreement(int id_offers, int id_applicants, String state, String contractors_qualification, String applicants_qualification) {
        this.id_offers = id_offers;
        this.id_applicants = id_applicants;
        this.state = state;
        this.contractors_qualification = contractors_qualification;
        this.applicants_qualification = applicants_qualification;
    }

    public Agreement() {
    }

    public int getId_offers() {
        return id_offers;
    }

    public Agreement setId_offers(int id_offers) {
        this.id_offers = id_offers;
        return this;
    }

    public int getId_applicants() {
        return id_applicants;
    }

    public Agreement setId_applicants(int id_applicants) {
        this.id_applicants = id_applicants;
        return this;
    }

    public String getState() {
        return state;
    }

    public Agreement setState(String state) {
        this.state = state;
        return this;
    }

    public String getContractors_qualification() {
        return contractors_qualification;
    }

    public Agreement setContractors_qualification(String contractors_qualification) {
        this.contractors_qualification = contractors_qualification;
        return this;
    }

    public String getApplicants_qualification() {
        return applicants_qualification;
    }

    public Agreement setApplicants_qualification(String applicants_qualification) {
        this.applicants_qualification = applicants_qualification;
        return this;
    }

    public static Agreement from(ResultSet rs) {
        try {
            return new Agreement(
                    rs.getInt("id_offers"),
                    rs.getInt("id_applicants"),
                    rs.getString("state"),
                    rs.getString("contractors_qualification"),
                    rs.getString("applicants_qualification"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
