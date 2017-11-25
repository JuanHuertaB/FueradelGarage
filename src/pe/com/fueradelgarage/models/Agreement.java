package pe.com.fueradelgarage.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Agreement {

    private int idOffers;
    private int idApplicants;
    private String state;
    private String contractorsQualification;
    private String applicantsQualification;

    public Agreement(int idOffers, int idApplicants, String state, String contractorsQualification, String applicantsQualification) {
        this.idOffers = idOffers;
        this.idApplicants = idApplicants;
        this.state = state;
        this.contractorsQualification = contractorsQualification;
        this.applicantsQualification = applicantsQualification;
    }

    public Agreement() {
    }

    public int getIdOffers() {
        return idOffers;
    }

    public Agreement setIdOffers(int idOffers) {
        this.idOffers = idOffers;
        return this;
    }

    public int getIdApplicants() {
        return idApplicants;
    }

    public Agreement setIdApplicants(int idApplicants) {
        this.idApplicants = idApplicants;
        return this;
    }

    public String getState() {
        return state;
    }

    public Agreement setState(String state) {
        this.state = state;
        return this;
    }

    public String getContractorsQualification() {
        return contractorsQualification;
    }

    public Agreement setContractorsQualification(String contractorsQualification) {
        this.contractorsQualification = contractorsQualification;
        return this;
    }

    public String getApplicantsQualification() {
        return applicantsQualification;
    }

    public Agreement setApplicantsQualification(String applicantsQualification) {
        this.applicantsQualification = applicantsQualification;
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
