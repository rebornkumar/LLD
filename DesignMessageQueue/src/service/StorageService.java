package service;

import model.Message;

public interface StorageService {
    boolean persistMessage(Message message);
    boolean persistTopic(String name)
;}
