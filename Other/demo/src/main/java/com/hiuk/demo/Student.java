package com.hiuk.demo;

import javax.persistence.*;

//As name is not specify, epxected to be student
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(name="PASSWORD")
    private String pw;
    @Column(name="EMAIL")
    private String email;


    public String getName() {
        return name;
    }

    public String getPw() {
        return pw;
    }

    public String getEmail() {
        return email;
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
        this.pw = "abc123";
        this.email = "I am email";
    }
}
