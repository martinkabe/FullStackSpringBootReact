package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

import static com.example.demo.student.Gender.*;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> students = Arrays.asList(
                new Student(1L, "Martin", "martin@gmail.com", MALE),
                new Student(2L, "Alex", "alex@gmail.com", MALE),
                new Student(3L, "Stephanie", "stephanie@gmail.com", FEMALE)
        );
        return students;
    }
}
