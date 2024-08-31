package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Topic {
    String name;
    Queue<String> messages;
    List<Subscriber> subscribers;

    public Topic(){}
    public Topic(String name) {
        this.name = name;
        this.messages = new LinkedList<>();
        this.subscribers = new ArrayList<>();
    }
    public void publishMessage(String message) {
        messages.add(message);
        notifySubscribers();
    }
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    private void notifySubscribers() {
        String message = messages.poll();
        for (Subscriber subscriber : subscribers) {
            subscriber.consume(message);
        }
    }
}
