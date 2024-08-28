package data;

import model.Topic;

import java.util.HashMap;
import java.util.Map;

public class TopicTable {
    public Map<String, Topic>topicMapper;
    private static TopicTable instance;
    //thread safe-singleton class

    private TopicTable() {
        topicMapper = new HashMap<>();
    }

    public static synchronized TopicTable getInstance() {
        if(instance == null) {
            instance = new TopicTable();
        }
        return instance;
    }
}
