package com.vjl.java_examples.spring.boot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @RequestMapping("/hello")
  public String sayHello() {
    return "Welcome to Hello World!!!";
  }

}
