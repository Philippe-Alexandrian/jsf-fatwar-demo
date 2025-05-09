package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloSpringBean {

  private static final Logger logger = LoggerFactory.getLogger(HelloSpringBean.class);

  @PostConstruct
  public void init() {
    logger.debug("@PostConstruct");
  }

  public String getMessage() {
    return "Hello from Spring !";
  }

}
