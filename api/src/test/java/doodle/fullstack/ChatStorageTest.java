package doodle.fullstack;


import doodle.fullstack.persistance.InMemoryChatStorage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ChatStorageTest {

    ChatStorage storage = new InMemoryChatStorage();

    @Test
    public void shouldAddMessageToStorage() {

        storage.addChatMessage("Hello");
        assertTrue(storage.getLatestChatMessages().equals("Hello"));
    }

    @Test
    public void shouldOnlyGetLatestMessage() {

        storage.addChatMessage("Hi2");
        storage.addChatMessage("Hi1");
        assertTrue(storage.getLatestChatMessages().equals("Hi2"));
        assertTrue(storage.getLatestChatMessages().equals("Hi1"));
    }

    @Test
    public void shouldNotFailIfChatIsEmpty() {

        assertTrue(storage.getLatestChatMessages() != null);
    }
}
