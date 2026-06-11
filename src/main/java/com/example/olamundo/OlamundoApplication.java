package com.example.olamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OlamundoApplication {

    public static void main(String[] args) {

        SpringApplication.run(OlamundoApplication.class, args);
    }

    @GetMapping("/ola")
    public String dizerOla(){
        return "Olá, mundo! Rodando no Java 25 com Spring Boot";
    }

}
