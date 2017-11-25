package pe.com.fueradelgarage.actions;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.fueradelgarage.models.GbService;
import pe.com.fueradelgarage.models.Offer;
import pe.com.fueradelgarage.models.OfferService;
import sun.nio.cs.ext.GB18030;

import java.util.Date;

public class OfferAction extends ActionSupport {
    Offer offer = new Offer();

    public String execute(){
        OfferService service = new OfferService();
        offer = service.createOffer(offer.getTitle(),offer.getStartTime(),offer.getEndTime(),offer.getDescription());
        return SUCCESS;
    }

    public String eliminar(){
        try {
            OfferService service = new OfferService();
            service.eraseOffer(offer.getIdOffers());
            return SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return INPUT;
        }
    }


    public String edit(){

        try{
            OfferService service = new OfferService();
            offer = service.findOfferById(offer.getIdOffers());
            int idUser = offer.getIdOffers();
            String title = offer.getTitle();
            String startTime = offer.getStartTime();
            String endTime = offer.getEndTime();
            String description = offer.getDescription();
            return SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return INPUT;
        }

    }
    public String update(){

        try{
            OfferService service = new OfferService();
            service.updateOffer(offer.getIdOffers(),offer.getTitle(),offer.getStartTime(),offer.getEndTime(),offer.getDescription());
            return SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return INPUT;
        }
    }

    public Offer getOffer(){return offer;}

    public void setOffer(Offer offer){
        this.offer = offer;
    }
}