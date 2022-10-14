package com.studentreporting.entities;

import java.util.HashMap;
import java.util.Map;

public enum Semester {
  FIRST(1, "first"),
  SECOND(2, "second");

  Semester(Integer id, String name) {
    this.id = id;
    this.name = name;
  }

  private static final Map<Integer, Semester> idToSemester = new HashMap();

  static {
    for (Semester semester : values()) idToSemester.put(semester.getId(), semester);
  }

  public static Semester fromId(Integer id) {
    return idToSemester.get(id);
  }

  private Integer id;

  private String name;

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
