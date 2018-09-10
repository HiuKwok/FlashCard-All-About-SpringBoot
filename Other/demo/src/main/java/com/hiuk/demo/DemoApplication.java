package com.hiuk.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//Db console: http://localhost:8080/h2-console.
// Use [ jdbc:h2:mem:testdb] on console instead to view data
//Tut: http://www.springboottutorial.com/spring-boot-and-h2-in-memory-database
//https://ithelp.ithome.com.tw/articles/10194906
//http://www.springboottutorial.com/spring-boot-crud-rest-service-with-jpa-hibernate
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
