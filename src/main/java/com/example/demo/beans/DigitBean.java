package com.example.demo.beans;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
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
