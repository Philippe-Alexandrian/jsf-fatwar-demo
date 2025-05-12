package com.example.demo.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
@RequestScoped
public class HelloCdiBeanRequest {

  private static final Logger logger = LoggerFactory.getLogger(HelloCdiBeanRequest.class);

  private Integer count = 0;

  @Inject
  @ManagedProperty(value = "#{helloSpringBeanSingleton}")
  private HelloSpringBeanSingleton helloSpringBeanSingleton;

  public String getMessage() {
    logger.debug("Get message from Spring Bean");
    count = count + 1;
    return helloSpringBeanSingleton.getMessage() + count;
  }

  public String next() {
    return "digit";
  }

}
