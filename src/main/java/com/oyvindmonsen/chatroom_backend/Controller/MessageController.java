package com.oyvindmonsen.chatroom_backend.Controller;

import com.oyvindmonsen.chatroom_backend.messages.Message;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MessageController {

    @MessageMapping("/messages/rooms/{room}")
    public Message basicMessage(@DestinationVariable String room, @RequestParam Message message) {
        return message;
    }

    @MessageMapping("/greetings")
    public Message greeting(@RequestParam Message requestMessage) {
        Message response = new Message();

        response.setContent("Hello there! Thanks for your message: " + requestMessage.getContent());

        return response;
    }

}
