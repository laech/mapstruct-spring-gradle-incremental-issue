package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class DemoApplication {

  @Autowired
  private PersonMapper personMapper;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

}
