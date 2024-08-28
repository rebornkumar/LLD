package service.impl;

import data.TopicTable;
import model.Message;
import model.Topic;
import service.StorageService;

public class StorageServiceImpl implements StorageService {
    TopicTable topicTable = TopicTable.getInstance();
    @Override
    public boolean persistMessage(Message message) {
        String topic = message.getTopic();
        if(topicTable.topicMapper.containsKey(topic)) {
            topicTable.topicMapper.get(topic).messages.add(message);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean persistTopic(String name) {
        if(topicTable.topicMapper.containsKey(name)){
            return false;
        }else {
            topicTable.topicMapper.put(name, new Topic(name));
            return true;
        }
    }

}
