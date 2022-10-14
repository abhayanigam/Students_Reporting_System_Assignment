package com.studentreporting.repository;

import com.studentreporting.entities.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryImpl implements StudentRepository {


  @Override
  public Student getStudent(Integer studentId) {
    return null;
  }

  @Override
  public void deleteStudent(Integer studentId) {

  }

  @Override
  public void updateStudent(Student student) {

  }

  @Override
  public Integer createStudent(Student student) {
    return null;
  }
}
