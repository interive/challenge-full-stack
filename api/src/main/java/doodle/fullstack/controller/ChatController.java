package doodle.fullstack.controller;


import doodle.fullstack.ChatStorage;
import doodle.fullstack.persistance.InMemoryChatStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ChatController {

    @Autowired
    private ChatStorage chatStorage;

    @CrossOrigin
    @GetMapping("/chat")
    public String getChat() {
        return
                chatStorage.getLatestChatMessages();
    }

    @CrossOrigin
    @PostMapping("/chat")
    public boolean postChat(@RequestBody String text) {
        return
                chatStorage.addChatMessage(text);
    }
}