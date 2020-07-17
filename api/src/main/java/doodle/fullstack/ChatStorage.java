package doodle.fullstack;

import java.util.List;

public interface ChatStorage {

    boolean addChatMessage(String message);

    List<String> getAllChatMessages();
    String getLatestChatMessages();
}
