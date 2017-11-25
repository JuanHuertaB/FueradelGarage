package pe.com.fueradelgarage.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgreementsEntity extends BaseEntity {
    public AgreementsEntity(){
        super();
        setTableName("agreements");
    }

    public AgreementsEntity(Connection connection, String tableName ){
        super(connection, tableName);
    }

    public Agreement findById(int idOffers){
        return findByCriteria(
                String.format("WHERE id_offers = %d",idOffers)).get(0);
    }

    public List<Agreement> findByCriteria(String criteria){

        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                                    .concat(criteria));
            List<Agreement> agreements = new ArrayList<>();
            while (rs.next())
                agreements.add(Agreement.from(rs));

            return agreements;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Agreement> findAll(){
        return findByCriteria("");
    }

    public Agreement create(Agreement agreement){
        return executeUpdate(String.format(
                "INSERT INTO %s(id_offers,id_applicants,state,contractors_qualification,applicants_qualification) VALUES (%d,%d,'%s','%s','%s')",
                getTableName(),agreement.getIdOffers(),agreement.getIdApplicants(),agreement.getState(),agreement.getContractorsQualification(),agreement.getApplicantsQualification()))?
                agreement : null;
    }

    public Agreement create (String state, String contractorsQualification, String applicantsQualification){
        return create(0,0,state,contractorsQualification,applicantsQualification);
    }

    public Agreement create (int idOffers, int idApplicants, String state, String contractorsQualification, String applicantsQualification){
        return create(new Agreement(idOffers, idApplicants ,state,contractorsQualification,applicantsQualification));
    }

    // El usuario no actualiza update score
    // user no update score

    public  boolean update(int idOffers, int idApplicants, String state){
        return executeUpdate(String.format(
                "UPDATE %s SET id_applicants = %d, state = '%s' WHERE id_offers = %d",getTableName(),idApplicants,state,idOffers));
    }

    public boolean update(Agreement agreement){
        return update(agreement.getIdOffers(),agreement.getIdApplicants(),agreement.getState());
    }

    public boolean erase(int idOffers){
        return executeUpdate(String.format("DELETE FROM %s WHERE id_offers=%d",
                getTableName(),idOffers));
    }

    public boolean erase(Agreement agreement){
        return executeUpdate(String.format("DELETE FROM %s WHERE id_offers=%d",
                getTableName(),agreement.getIdOffers()));
    }
}
