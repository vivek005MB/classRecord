package com.example.studentrecords.repository;

import com.example.studentrecords.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
