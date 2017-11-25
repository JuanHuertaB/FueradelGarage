package pe.com.fueradelgarage.models;

public class OfferService {
    OfferDataStore dataStore = new OfferDataStore();
    
    public Offer createOffer(String title, String startTime, String endTime, String description) {
        return dataStore.createOffer(title,startTime,endTime,description);}

    public Offer findOfferById(int idOffers) {
        return dataStore.findOfferById(idOffers);
    }

    public boolean eraseOffer(int idOffers) { return dataStore.eraseOffer();
    }

    public boolean updateOffer(int idOffers, String title, String startTime, String endTime, String description) {
        return dataStore.updateOffer(idOffers,title,startTime,endTime,description);
    }
}
