package pe.com.fueradelgarage.actions;

import com.opensymphony.xwork2.ActionSupport;
import pe.com.fueradelgarage.models.Event;
import pe.com.fueradelgarage.models.EventService;
import pe.com.fueradelgarage.models.GbService;

public class EventAction extends ActionSupport {

    Event event = new Event();

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public String execute(){
        EventService service = new EventService();
        event = service.createEvent(event.getIdUser(),event.getNameEvent(),event.getStart(),event.getEnd(),event.getPlace(),event.getDescription());
        return SUCCESS;
    }

    public String eliminar(){
        try {
            EventService service = new EventService();
            service.eraseEvent(event.getId());
            return SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return INPUT;
        }
    }

    public String edit(){
        try {
            EventService service = new EventService();
            event = service.findEventById(event.getId());

            return SUCCESS;
        }catch (Exception e) {
            e.printStackTrace();
            return INPUT;
        }
    }

    public String update(){
        try {
            EventService service = new EventService();
            service.updateEvent(event.getId(),event.getNameEvent(),event.getStart(),event.getEnd(),event.getPlace(),event.getDescription());
            return SUCCESS;
        }catch (Exception e){
            e.printStackTrace();
            return INPUT;
        }
    }

}
