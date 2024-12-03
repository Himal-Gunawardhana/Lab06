package com.example.mongoProject.Service;

import com.example.mongoProject.Model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    Student saveStudent(Student student);

    Optional<Student> getStudentById(String id);

    List<Student> getAllStudents();

    void deleteStudent(String id);
}


