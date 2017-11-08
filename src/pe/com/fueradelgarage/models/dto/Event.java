package pe.com.fueradelgarage.models.dto;

public class Event {
    private int id;
    private int id_user;
    private String firstName;
    private String lastName;
    private String videoUrl;
    private Contractor contractor;

    public Event(int id, int id_user, String firstName, String lastName, String videoUrl, Contractor contractor) {
        this.id = id;
        this.id_user = id_user;
        this.firstName = firstName;
        this.lastName = lastName;
        this.videoUrl = videoUrl;
        this.contractor = contractor;
    }

    public int getId() {
        return id;
    }

    public Event setId(int id) {
        this.id = id;
        return this;
    }

    public int getId_user() {
        return id_user;
    }

    public Event setId_user(int id_user) {
        this.id_user = id_user;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Event setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Event setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public Event setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public Event setContractor(Contractor contractor) {
        this.contractor = contractor;
        return this;
    }

}
