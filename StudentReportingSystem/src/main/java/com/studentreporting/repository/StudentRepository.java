package com.studentreporting.repository;

import com.studentreporting.entities.Student;

public interface StudentRepository {

  public Student getStudent(Integer studentId);

  public void deleteStudent(Integer studentId);

  public void updateStudent(Student student);

  public Integer createStudent(Student student);
}
