package com.oyvindmonsen.chatroom_backend.messages;

public class Message {
  private String content;
  private String senderName;

  public Message() {

  }


  public Message(String content, String senderName) {
    this.content = content;
    this.senderName = senderName;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getSenderName() {
    return senderName;
  }

  public void setSenderName(String senderName) {
    this.senderName = senderName;
  }
}
