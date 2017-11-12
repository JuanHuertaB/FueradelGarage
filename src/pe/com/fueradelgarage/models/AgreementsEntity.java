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

    public Agreement findById(int id_offers){
        return findByCriteria(
                String.format("WHERE id_offers = %d",id_offers)).get(0);
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
                getTableName(),agreement.getId_offers(),agreement.getId_applicants(),agreement.getState(),agreement.getContractors_qualification(),agreement.getApplicants_qualification()))?
                agreement : null;
    }

    public Agreement create (String state, String contractors_qualification, String applicants_qualification){
        return create(0,0,state,contractors_qualification,applicants_qualification);
    }

    public Agreement create (int id_offers, int id_applicants, String state, String contractors_qualification, String applicants_qualification){
        return create(new Agreement(id_offers, id_applicants ,state,contractors_qualification,applicants_qualification));
    }

    // El usuario no actualiza update score
    // user no update score

    public  boolean update(int id_offers, int id_applicants, String state){
        return executeUpdate(String.format(
                "UPDATE %s SET id_applicants = %d, state = '%s' WHERE id_offers = %d",getTableName(),id_applicants,state,id_offers));
    }

    public boolean update(Agreement agreement){
        return update(agreement.getId_offers(),agreement.getId_applicants(),agreement.getState());
    }

    public boolean erase(int id_offers){
        return executeUpdate(String.format("DELETE FROM %s WHERE id_offers=%d",
                getTableName(),id_offers));
    }

    public boolean erase(Agreement agreement){
        return executeUpdate(String.format("DELETE FROM %s WHERE id_offers=%d",
                getTableName(),agreement.getId_offers()));
    }
}
