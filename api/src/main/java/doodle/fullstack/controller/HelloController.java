package doodle.fullstack.controller;


import doodle.fullstack.ChatStorage;
import doodle.fullstack.persistance.InMemoryChatStorage;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    ChatStorage chatStorage = new InMemoryChatStorage();

    @CrossOrigin(origins = "http://localhost:63342")
    @RequestMapping("/")
    public String index() {
        return
                chatStorage.getChatLatestChatMessages().get(0);
    }
}