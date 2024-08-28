package model;

public class TextMessage extends Message {
    String content;
    public TextMessage(Integer id, String topic, String content) {
        super(id,topic);
        this.content = content;
    }
    @Override
    public String getContent() {
        return this.content;
    }
}
