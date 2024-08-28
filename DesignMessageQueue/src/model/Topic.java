package model;

import java.util.ArrayList;
import java.util.List;

public class Topic {
    static Integer globalTopicId = 1;
    Integer id;
    String name;
    public List<Message>messages;
    public Topic(String name) {
        this.id = globalTopicId++;
        this.name = name;
        messages = new ArrayList<>();
    }


    //getter & setter
    //add messages

}

/*
every topic has message list
 */