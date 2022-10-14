package com.studentreporting.service;

import com.studentreporting.entities.Student;
import com.studentreporting.entities.StudentMarks;

import java.util.List;

public interface StudentService {

  public Student getStudent(Integer studentId);

  public void deleteStudent(Integer studentId);

  public void updateStudent(Student student);

  public Integer createStudent(Student student);

    List<Student> getStudents();

    void addMarks(StudentMarks marks);
}
