package com.streetflo.miocat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MiocatApplication {

    public static void main(String[] args) {

        SpringApplication.run(MiocatApplication.class, args);
    }

}
