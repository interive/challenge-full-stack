package doodle.fullstack.persistance;

import doodle.fullstack.ChatStorage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InMemoryChatStorage implements ChatStorage {

    public List<String> getChatLatestChatMessages() {
        return Arrays.asList("Hello", "world");
    }
}
