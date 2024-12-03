package com.example.mongoProject.repo;

import com.example.mongoProject.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends MongoRepository<Student, String> {
    // You can define custom query methods here if needed, for example:
    // List<Student> findByLastName(String lastName);
}
