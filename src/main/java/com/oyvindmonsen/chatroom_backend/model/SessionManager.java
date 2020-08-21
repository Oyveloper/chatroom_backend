package com.oyvindmonsen.chatroom_backend.model;

import java.util.HashMap;
import java.util.Map;

public class SessionManager {

  private static SessionManager sessionManagerInstance;
  private Map<String, Session> sessions = new HashMap<>();

  public Session getSession(String sessionId) {
    return this.sessions.get(sessionId);
  }

  public static SessionManager getInstance() {

    if (sessionManagerInstance == null) {
      sessionManagerInstance = new SessionManager();
    }

    return sessionManagerInstance;
  }

  public void addSession(Session session) {
    this.sessions.put(session.getId(), session);
  }

  public void removeSession(String sessionId) throws IllegalStateException {
    if (!this.sessions.containsKey(sessionId)) {
      throw new IllegalStateException("Session does not exist");
    }

    this.sessions.remove(sessionId);
  }

  public void removeSession(Session session) throws IllegalStateException {
    this.removeSession(session.getId());
  }

  public Map<String, Session> getSessions() {
    return sessions;
  }
}
