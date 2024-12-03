package com.example.mongoProject.Service;

import com.example.mongoProject.Model.Student;
import com.example.mongoProject.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepo studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Create or update a student
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // Get a student by ID
    @Override
    public Optional<Student> getStudentById(String id) {
        return studentRepository.findById(id);
    }

    // Get all students
    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Delete a student by ID
    @Override
    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }
}

