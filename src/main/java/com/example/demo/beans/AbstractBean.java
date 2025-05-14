package com.example.demo.beans;

public class AbstractBean {

  protected String input;
  protected String output = "";
  protected Integer count = 0;

  public void submit() {
    output = input;
  }

  public String getInput() {
    return input;
  }

  public void setInput(String input) {
    this.input = input;
  }

  public String getOutput() {
    return output;
  }

  public Integer getCount() {
    count = count + 1;
    return count;
  }

}
