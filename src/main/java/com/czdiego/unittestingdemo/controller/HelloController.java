package com.czdiego.unittestingdemo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

  @CrossOrigin
  @GetMapping(value = "/",
      produces = {MediaType.APPLICATION_JSON_VALUE})
  public String getSecurityQuestions() {

    return "Hello world";

  }
}
