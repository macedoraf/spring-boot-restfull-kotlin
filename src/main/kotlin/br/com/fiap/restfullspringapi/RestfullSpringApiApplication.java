package br.com.fiap.restfullspringapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@EnableAutoConfiguration
@Controller
public class RestfullSpringApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestfullSpringApiApplication.class, args);
    }
}
