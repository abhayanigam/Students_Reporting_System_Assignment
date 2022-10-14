package com.studentreporting.entities;

import java.util.HashMap;
import java.util.Map;

public enum Subject {
  ENGLISH(1, "English"),
  MATHS(2, "Maths"),
  SCIENCE(3, "Science");

  Subject(Integer id, String subject) {
    this.id = id;
    this.subject = subject;
  }

  private static final Map<Integer, Subject> idToSubject = new HashMap();

  static {
    for (Subject subject : values()) idToSubject.put(subject.getId(), subject);
  }

  public static Subject fromId(Integer id) {
    return idToSubject.get(id);
  }

  private Integer id;

  private String subject;

  public Integer getId() {
    return id;
  }

  public String getSubject() {
    return subject;
  }
}
