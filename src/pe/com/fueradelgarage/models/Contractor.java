package pe.com.fueradelgarage.models;

public class Contractor {
    private String id;
    private String user;
    private String password;
    private String name;
    private String lastName;
    private String description;
    private Integer score;
    private String videoUrl;

    public Contractor(String id, String user, String password, String name, String lastName, String description, Integer score, String videoUrl) {
        this.id = id;
        this.user = user;
        this.password = password;
        this.name = name;
        this.lastName = lastName;
        this.description = description;
        this.score = score;
        this.videoUrl = videoUrl;
    }

    public String getId() {
        return id;
    }

    public Contractor setId(String id) {
        this.id = id;
        return this;
    }

    public String getUser() {
        return user;
    }

    public Contractor setUser(String user) {
        this.user = user;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Contractor setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getName() {
        return name;
    }

    public Contractor setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Contractor setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Contractor setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getScore() {
        return score;
    }

    public Contractor setScore(Integer score) {
        this.score = score;
        return this;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public Contractor setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
}
