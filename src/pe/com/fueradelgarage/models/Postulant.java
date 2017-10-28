package pe.com.fueradelgarage.models;

public class Postulant {
    private String id;
    private String userPos;
    private String passwordPos;
    private String descriptionPos;
    private String scorePos;
    private String videoPos;

    public Postulant(String id, String userPos, String passwordPos, String descriptionPos, String scorePos, String videoPos) {
        this.id = id;
        this.userPos = userPos;
        this.passwordPos = passwordPos;
        this.descriptionPos = descriptionPos;
        this.scorePos = scorePos;
        this.videoPos = videoPos;
    }

    public String getId() {
        return id;
    }

    public Postulant setId(String id) {
        this.id = id;
        return this;
    }

    public String getUserPos() {
        return userPos;
    }

    public Postulant setUserPos(String userPos) {
        this.userPos = userPos;
        return this;
    }

    public String getPasswordPos() {
        return passwordPos;
    }

    public Postulant setPasswordPos(String passwordPos) {
        this.passwordPos = passwordPos;
        return this;
    }

    public String getDescriptionPos() {
        return descriptionPos;
    }

    public Postulant setDescriptionPos(String descriptionPos) {
        this.descriptionPos = descriptionPos;
        return this;
    }

    public String getScorePos() {
        return scorePos;
    }

    public Postulant setScorePos(String scorePos) {
        this.scorePos = scorePos;
        return this;
    }

    public String getVideoPos() {
        return videoPos;
    }

    public Postulant setVideoPos(String videoPos) {
        this.videoPos = videoPos;
        return this;
    }
}
