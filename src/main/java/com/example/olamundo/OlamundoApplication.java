package com.example.olamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class OlamundoApplication {

    public static void main(String[] args) {

        SpringApplication.run(OlamundoApplication.class, args);
    }

    //modelo imutael que representa o JSON enviado no POST
    public record AlunoRequest(String nome, String curso) {}

    @GetMapping("/ola")
    public String dizerOla() {
        return "Olá, mundo! Rodando no Java 25 com Spring Boot";
    }

    @PostMapping("/aluno")
    public String cadastrarAluno(@RequestBody AlunoRequest aluno) {
        return "Aluno cadastrado com sucesso: " + aluno.nome() + " | Curso: " + aluno.curso();
    }


}



