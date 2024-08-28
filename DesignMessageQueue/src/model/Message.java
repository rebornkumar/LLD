package model;

public abstract class Message {
    private Integer id;
    private String topic;

    public Message(Integer id, String topic) {
        this.id = id;
        this.topic = topic;
    }
    public String getTopic() {
        return this.topic;
    }
    public abstract String getContent();
}
