package com.example.demo.beans;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class HelloSpringBeanSession extends AbstractBean {

  private static final Logger logger = LoggerFactory.getLogger(HelloSpringBeanSession.class);

  @PostConstruct
  public void init() {
    logger.debug("{}@PostConstruct", HelloSpringBeanSession.class.getSimpleName());
  }

}
