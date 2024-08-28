package service;

import model.Message;

public interface PublishService {
    boolean createTopic(String name);
    boolean createMessage(Message message);
}
