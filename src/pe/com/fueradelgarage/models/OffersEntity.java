package pe.com.fueradelgarage.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OffersEntity extends BaseEntity{

    public OffersEntity(){
        super();
        setTableName("offers");
    }

    public OffersEntity(Connection connection, String tableName ){
        super(connection, tableName);
    }

    public Offer findById(int id_offers){
        return findByCriteria(
                String.format("WHERE id_offers = %d",id_offers)).get(0);
    }

    public List<Offer> findByCriteria(String criteria){

        try {
            ResultSet rs = getConnection()
                    .createStatement()
                    .executeQuery(
                            getBaseStatement()
                                    .concat(criteria));
            List<Offer> offers = new ArrayList<>();
            while (rs.next())
                offers.add(Offer.from(rs));

            return offers;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Offer findByName(String title){
        return findByCriteria(
                String.format("WHERE title = '%s'",title)).get(0);
    }

    public List<Offer> findAll(){
        return findByCriteria("");
    }


    public Offer create(Offer offer){
        return executeUpdate(String.format(
                "INSERT INTO %s(id_events,title,start_time,end_time,descrption) VALUES (%d,'%s','%s','%s','%s')",
                getTableName(),offer.getId_events(),offer.getTitle(),offer.getStart_time(),offer.getEnd_time(), offer.getDescription()))?
                offer : null;
    }

    public Offer create (int id_events, String title, String start_time, String end_time, String description){
        return create(0, id_events, title, start_time,end_time,description);
    }

    public Offer create (int id_offer, int id_events, String title, String start_time, String end_time, String descrption){
        return create(new Offer(id_offer, id_events,title,start_time,end_time,descrption));
    }

    // El usuario no actualiza update id_events
    // user no update id_events

    public  boolean update(int id_offers, String title, String start_time, String end_time, String description){
        return executeUpdate(String.format("UPDATE %s SET title = '%s', start_time = '%s', end_time = '%s', description = '%s' WHERE id_offers = %d",getTableName(),title,start_time,end_time,description,id_offers));
    }

    public boolean update(Offer offer){
        return update(offer.getId_offers(),offer.getTitle(),offer.getStart_time(),offer.getEnd_time(),offer.getDescription());
    }

    public boolean erase(int id_offers){
        return executeUpdate(String.format("DELETE FROM %s WHERE id_offers=%d",
                getTableName(),id_offers));
    }

    public boolean erase(Offer offer){
        return executeUpdate(String.format("DELETE FROM %s WHERE id_offers=%d",
                getTableName(),offer.getId_offers()));
    }
}
