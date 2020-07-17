package doodle.fullstack;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ChatStorageIntegrationTest {

    @Autowired
    ChatStorage storage;

    @Test
    public void shouldStartStorage() {
        assertTrue(storage != null);
    }
}
