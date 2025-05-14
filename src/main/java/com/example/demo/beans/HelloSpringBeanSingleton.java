package com.example.demo.beans;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HelloSpringBeanSingleton extends AbstractBean {

  private static final Logger logger = LoggerFactory.getLogger(HelloSpringBeanSingleton.class);

  @PostConstruct
  public void init() {
    logger.debug("{}@PostConstruct", HelloSpringBeanSingleton.class.getSimpleName());
  }

  public String getMessage() {
    return HelloSpringBeanSingleton.class.getSimpleName();
  }

}
