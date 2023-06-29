package com.example.studentrecords;

import com.example.studentrecords.entity.Student;
import com.example.studentrecords.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentRecordsApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentRecordsApplication.class, args);

    }
//    @Autowired
//    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {


//        Student s1 = new Student("Mojo","jojo","mj@mail.com");
//        studentRepository.save(s1);
//        Student s2 = new Student("Peter","Parker","pp@mail.com");
//        studentRepository.save(s2);
//        Student s3 = new Student("Bruce","Wayne","notBatman@mail.com");
//        studentRepository.save(s3);
//        Student s4 = new Student("cristiano","ronaldo","suiii@mail.com");
//        studentRepository.save(s4);

    }
}
