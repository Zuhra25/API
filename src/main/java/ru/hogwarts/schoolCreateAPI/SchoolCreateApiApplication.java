package ru.hogwarts.schoolCreateAPI;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@OpenAPIDefinition
public class SchoolCreateApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolCreateApiApplication.class, args);
    }

}
