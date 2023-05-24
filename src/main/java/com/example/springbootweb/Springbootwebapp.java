package com.example.springbootweb;


import com.example.springbootpractice.SpringbootPracticeApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Springbootwebapp {


  @GetMapping("/welcome")
  public static void main(String args[]){
    SpringApplication.run(Springbootwebapp.class,
            args);
  }
}
