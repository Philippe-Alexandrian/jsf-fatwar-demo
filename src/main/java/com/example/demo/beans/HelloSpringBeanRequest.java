package com.example.demo.beans;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class HelloSpringBeanRequest extends AbstractBean {

  private static final Logger logger = LoggerFactory.getLogger(HelloSpringBeanRequest.class);

  @PostConstruct
  public void init() {
    logger.debug("{}@PostConstruct", HelloSpringBeanRequest.class.getSimpleName());
  }

}
