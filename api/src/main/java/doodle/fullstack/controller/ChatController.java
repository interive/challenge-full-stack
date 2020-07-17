package doodle.fullstack.controller;


import doodle.fullstack.ChatStorage;
import doodle.fullstack.persistance.InMemoryChatStorage;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChatController {

    ChatStorage chatStorage = new InMemoryChatStorage();

    @CrossOrigin(origins = "http://localhost:63342")
    @GetMapping("/chat")
    public String getChat() {
        return
                chatStorage.getLatestChatMessages().get(0);
    }

    @CrossOrigin(origins = "http://localhost:63342")
    @PostMapping("/chat")
    public boolean postChat(@RequestBody String text) {
        return
                chatStorage.addChatMessage(text);
    }
}