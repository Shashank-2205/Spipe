package com.example.Spring_WebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication

public class SpringWebAppApplication {
@GetMapping("/cse")
public String cse()
{
  return "Welcome to Cse Department";
}
  public static void main(String[] args) {
    SpringApplication.run(SpringWebAppApplication.class, args);
  }

}