package doodle.fullstack.persistance;

import doodle.fullstack.ChatStorage;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

@Repository
public class InMemoryChatStorage implements ChatStorage {

    List<String> chatStorage = new LinkedList();
    Queue<String> chatQueue = new LinkedBlockingQueue<>();

    @Override
    public boolean addChatMessage(String message) {
        chatStorage.add(message);
        chatQueue.add(message);
        return true;
    }

    @Override
    public List<String> getAllChatMessages() {
        return chatStorage;
    }

    @Override
    public String getLatestChatMessages() {
        if (chatStorage.size() == 0)
            return null;

        return chatQueue.poll();
    }
}
