package com.student.svcet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class StudentServiceOracleApplication {

    public static void main(String[] args) {

        SpringApplication.run(StudentServiceOracleApplication.class, args);
        System.out.println("Hello");
    }

}
