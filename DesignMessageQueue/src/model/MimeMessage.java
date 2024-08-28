package model;

public class MimeMessage extends Message {

    String content;
    String mimeUrl;
    public MimeMessage(Integer id, String topic, String content) {
        super(id,topic);
        this.mimeUrl = content;
        //follow adapter method

    }
    @Override
    public String getContent() {
        this.content = mimeUrl;
        return content;
    }
}
