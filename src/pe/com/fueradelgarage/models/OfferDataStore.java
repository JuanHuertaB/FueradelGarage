package pe.com.fueradelgarage.models;

import java.sql.Connection;

public class OfferDataStore {
    private OffersEntity offersEntity;
    private Connection connection;

    private OffersEntity getOfferEntity() {
        if(offersEntity == null) {
            offersEntity = new OffersEntity();
            offersEntity.setConnection(connection);
        }
        return offersEntity;
    }

    public Offer createOffer(String title, String startTime, String endTime, String description) {
        return null;
    }

    public Offer findOfferById(int idOffers) {
        if(connection == null) return null;
        return getOfferEntity().findById(idOffers);
    }

    public boolean eraseOffer() { return false;
    }

    public boolean updateOffer(int idOffers, String title, String startTime, String endTime, String description) {
        return false;
    }
}
