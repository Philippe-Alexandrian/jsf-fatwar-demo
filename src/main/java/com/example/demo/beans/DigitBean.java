package com.example.demo.beans;

import jakarta.enterprise.context.RequestScoped;
import org.springframework.stereotype.Component;

@Component
@RequestScoped
public class DigitBean {

  private Integer digit;

  public Integer getDigit() {
    return digit;
  }

  public void setDigit(Integer digit) {
    this.digit = digit;
  }

  public String submit() {
    return "hello?faces-redirect=true";
  }

}
