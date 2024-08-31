package model;

public class Publisher {
    private MessageQueue messageQueue;
    public Publisher(MessageQueue messageQueue) {
        this.messageQueue = messageQueue;
    }
    public void publish(String name, String message) {
        Topic topic = messageQueue.getTopic(name);
        if(topic != null) {
            topic.publishMessage(message);
        }
    }
}
