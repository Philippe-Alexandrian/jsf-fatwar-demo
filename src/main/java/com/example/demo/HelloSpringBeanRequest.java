package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class HelloSpringBeanRequest {

  private static final Logger logger = LoggerFactory.getLogger(HelloSpringBeanRequest.class);

  private Integer count = 0;

  @PostConstruct
  public void init() {
    logger.debug("HelloSpringBeanRequest@PostConstruct");
  }

  public String getMessage() {
    count = count + 1;
    return "HelloSpringBeanRequest" + count;
  }

  public String next() {
    return "number";
  }

}
