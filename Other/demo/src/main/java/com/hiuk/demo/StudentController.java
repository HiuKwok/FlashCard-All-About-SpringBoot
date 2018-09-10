package com.hiuk.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<?> addStudent (@PathVariable String name) {
        Student student = studentRepo.save(new Student(name));

        HttpHeaders headers = new HttpHeaders();
        return new ResponseEntity(headers, HttpStatus.CREATED);

    }

}
