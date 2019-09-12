package test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan({ "test2", "controller" })
public class MainApplicationClass {
    public static void main(String[] args) {
        SpringApplication.run(MainApplicationClass.class, args);
    }
}
