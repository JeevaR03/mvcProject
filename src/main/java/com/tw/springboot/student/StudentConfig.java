package com.tw.springboot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;
@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Jeeva=new Student(
                    "jeeva",
                    "jeevanadar1998@gmail.com");
            Student Vani=new Student(
                    "Vani",
                    "vani1998@gmail.com");
            repository.saveAll(
                    List.of(Jeeva,Vani)
            );

        };
    }
}
