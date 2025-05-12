package com.example.demo.beans;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class HelloSpringBeanPrototype {

  private static final Logger logger = LoggerFactory.getLogger(HelloSpringBeanPrototype.class);

  private Integer count = 0;

  @PostConstruct
  public void init() {
    logger.debug("HelloSpringBeanPrototype@PostConstruct");
  }

  public String getMessage() {
    count = count + 1;
    return "HelloSpringBeanPrototype" + count;
  }

  public String next() {
    return "digit";
  }

}
