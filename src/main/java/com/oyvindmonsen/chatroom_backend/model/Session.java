package com.oyvindmonsen.chatroom_backend.model;

import com.oyvindmonsen.chatroom_backend.messages.Message;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Session {

  private List<String> activeParticipants = new ArrayList<>();
  private Stack<Message> messages = new Stack<>();
  private String id;

  public Session() {

  }

  public Session(String id) {
    this.id = id;
  }

  public void addParticipant(String participant) throws IllegalStateException {
    if (this.activeParticipants.contains(participant)) {
      throw new IllegalStateException("Participant already added");
    }
    this.activeParticipants.add(participant);
  }

  public void removeParticipant(String participant) throws IllegalStateException {
    if (!this.activeParticipants.contains(participant)) {
      throw new IllegalStateException("Participant is not in this session");
    }

    this.activeParticipants.remove(participant);
  }

  public boolean isUserNameAvailable(String userName) {
    return !this.activeParticipants.contains(userName);
  }

  public void addMessage(Message message) {
    this.messages.add(message);
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
