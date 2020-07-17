package doodle.fullstack.persistance;

import doodle.fullstack.ChatStorage;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class InMemoryChatStorage implements ChatStorage {

    List<String> chatStorage = new LinkedList();

    @Override
    public boolean addChatMessage(String message) {
        return chatStorage.add(message);
    }

    @Override
    public List<String> getAllChatMessages() {
        return chatStorage;
    }

    @Override
    public List<String> getLatestChatMessages() {
        if (chatStorage.size() == 0)
            return Arrays.asList("This chat is still empty. " +
                    "You can be the first to say hi : )");

        return Arrays.asList(chatStorage.get(chatStorage.size()-1));
    }
}
