package com.oyvindmonsen.chatroom_backend.messages;

public class Greeting {

  private String text;

  public Greeting() {

  }

  public Greeting(String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}
