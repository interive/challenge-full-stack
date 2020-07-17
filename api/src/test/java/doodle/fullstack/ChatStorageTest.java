package doodle.fullstack;


import doodle.fullstack.persistance.InMemoryChatStorage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChatStorageTest {

    ChatStorage storage = new InMemoryChatStorage();

    @Test
    public void shouldAddMessageToStorage() {

        storage.addChatMessage("Hello");
        assertTrue(storage.getLatestChatMessages().get(0).equals("Hello"));
    }

    @Test
    public void shouldNotFailIfChatIsEmpty() {

        assertTrue(storage.getLatestChatMessages() != null);
        assertTrue(storage.getLatestChatMessages().get(0) != null);
    }
}
