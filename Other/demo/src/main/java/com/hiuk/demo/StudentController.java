package com.hiuk.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    private static final String endpoint = "/students";
    private static final String epWithName = "/students/{name}";

   @Autowired
    private StudentRepo studentRepo;


    @GetMapping(endpoint)
    public List<Student> retrieveAllStudents() {
        return (List<Student>) studentRepo.findAll();
    }

    @PostMapping(epWithName)
    public void addStudent (@PathVariable String name) {
        studentRepo.save(new Student(name));
    }

}
