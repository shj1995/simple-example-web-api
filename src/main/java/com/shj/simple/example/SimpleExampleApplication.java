package com.shj.simple.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
public class SimpleExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleExampleApplication.class, args);
    }

}
