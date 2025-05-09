package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class HelloSpringBeanSession {

  private static final Logger logger = LoggerFactory.getLogger(HelloSpringBeanSession.class);

  private Integer count = 0;

  @PostConstruct
  public void init() {
    logger.debug("HelloSpringBeanSession@PostConstruct");
  }

  public String getMessage() {
    count = count + 1;
    return "HelloSpringBeanSession" + count;
  }

}
