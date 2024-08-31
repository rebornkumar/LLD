package model;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MessageQueue {
    Map<String,Topic>topics;
    public MessageQueue() {
        this.topics = new ConcurrentHashMap<>();
    }
    public Topic createTopic(String name) {
        Topic topic = new Topic(name);
        topics.put(name, topic);
        return topic;
    }
    public Topic getTopic(String name) {
        return topics.get(name);
    }
}
