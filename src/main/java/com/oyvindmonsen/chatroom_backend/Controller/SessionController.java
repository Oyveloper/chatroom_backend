package com.oyvindmonsen.chatroom_backend.Controller;

import com.oyvindmonsen.chatroom_backend.messages.Greeting;
import com.oyvindmonsen.chatroom_backend.messages.Message;
import com.oyvindmonsen.chatroom_backend.model.Session;
import com.oyvindmonsen.chatroom_backend.model.SessionManager;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SessionController {
  @GetMapping("/test")
  public String test() {
    return "Hello there, Obeyone kenobey";
  }

  @GetMapping("/sessions/{room}")
  public Session getSessionInfo(@DestinationVariable String room) {
    Session session;
    try {
      session = SessionManager.getInstance().getSession(room);
    } catch (IllegalStateException exception) {
      session = new Session();
      SessionManager.getInstance().addSession(session);
    }
    return session;
  }

}
