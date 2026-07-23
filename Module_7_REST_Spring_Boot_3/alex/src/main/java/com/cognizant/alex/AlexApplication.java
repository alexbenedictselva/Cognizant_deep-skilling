package com.cognizant.alex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.cognizant")
public class AlexApplication {

    public static void main(String[] args) {
        SpringApplication.run(AlexApplication.class, args);
    }

}
