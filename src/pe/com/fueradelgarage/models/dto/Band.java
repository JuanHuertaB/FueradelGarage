package pe.com.fueradelgarage.models.dto;
import pe.com.fueradelgarage.models.dao.ApplicantsEntity;
import pe.com.fueradelgarage.models.dao.UsersEntity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Band {
    private int id;
    private Applicant applicant;

    public Band() {
    }

    public Band(int id, Applicant applicant) {
        this.id = id;
        this.applicant = applicant;
    }

    public int getId() {
        return id;
    }

    public Band setId(int id) {
        this.id = id;
        return this;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public Band setApplicant(Applicant applicant) {
        this.applicant = applicant;
        return this;
    }
    //Se agrega el userEntity comp parametro porque el finbyid de aplicantsEntity lo exige
    public static Band from(ResultSet rs, ApplicantsEntity applicantsEntity,UsersEntity usersEntity){
        Band band = new Band();
        try {
            return band.setId(rs.getInt("id_band"))
                    .setApplicant(applicantsEntity.findById(rs.getInt("id"),usersEntity));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
