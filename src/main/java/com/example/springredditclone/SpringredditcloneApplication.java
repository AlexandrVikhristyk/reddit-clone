package com.example.springredditclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringredditcloneApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringredditcloneApplication.class, args);
    }

}
