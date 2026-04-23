package com.takestock.takestockireland;

import com.takestock.takestockireland.entity.User;
import com.takestock.takestockireland.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class TakestockirelandApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakestockirelandApplication.class, args);
    }


}