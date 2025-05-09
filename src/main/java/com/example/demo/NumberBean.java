package com.example.demo;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import org.springframework.stereotype.Component;

// TODO A Supprimer ?
@Named
@Component
@RequestScoped
public class NumberBean {

  private Integer number;

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String submit() {
    return "hello";
  }

}
