package com.example.demo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
@RequestScoped
public class HelloCdiBean {

  private static final Logger logger = LoggerFactory.getLogger(HelloCdiBean.class);

  @Inject
  @ManagedProperty(value = "#{helloSpringBeanSingleton}")
  private HelloSpringBeanSingleton helloSpringBeanSingleton;

  public String getMessage() {
    logger.debug("Get message from Spring Bean");
    return helloSpringBeanSingleton.getMessage();
  }

  public String next() {
    return "number";
  }

}
