package com.example.demo.beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
@SessionScoped
public class HelloCdiBeanSession implements Serializable {

  private static final long serialVersionUID = -1523213805518273389L;

  private static final Logger logger = LoggerFactory.getLogger(HelloCdiBeanSession.class);

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
