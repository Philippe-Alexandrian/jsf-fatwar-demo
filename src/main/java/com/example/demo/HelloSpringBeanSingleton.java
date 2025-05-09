package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloSpringBeanSingleton {

  private static final Logger logger = LoggerFactory.getLogger(HelloSpringBeanSingleton.class);

  private Integer count = 0;

  @PostConstruct
  public void init() {
    logger.debug("HelloSpringBeanSingleton@PostConstruct");
  }

  public String getMessage() {
    count = count + 1;
    return "HelloSpringBeanSingleton" + count;
  }

  public String next() {
    return "digit";
  }

}
