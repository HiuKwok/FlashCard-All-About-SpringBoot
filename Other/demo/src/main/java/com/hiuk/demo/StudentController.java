package com.hiuk.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

   @Autowired
    private StudentRepo studentRepo;


    @GetMapping("/students")
    public List<Student> retrieveAllStudents() {
        return (List<Student>) studentRepo.findAll();
    }
}
