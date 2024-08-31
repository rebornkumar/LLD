// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import model.*;
public class Main {
    public static void main(String[] args) {
        MessageQueue messageQueue = new MessageQueue();
        Topic topic = messageQueue.createTopic("dolphin");
        Subscriber sub1 = new ParallelSubscriber();
        Subscriber sub2 = new ParallelSubscriber();
        topic.addSubscriber(sub1);
        topic.addSubscriber(sub2);
        Publisher pub = new Publisher(messageQueue);
        pub.publish("dolphin", "I just posted about dolphins.Please have a look.");
    }
}