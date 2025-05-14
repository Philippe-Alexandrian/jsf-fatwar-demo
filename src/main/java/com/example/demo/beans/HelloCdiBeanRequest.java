package com.example.demo.beans;

import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.annotation.ManagedProperty;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class HelloCdiBeanRequest extends AbstractBean {

  @Inject
  @ManagedProperty(value = "#{helloSpringBeanSingleton}")
  private HelloSpringBeanSingleton helloSpringBeanSingleton;

  public String getMessage() {
    return "Message from " + helloSpringBeanSingleton.getMessage();
  }

}
