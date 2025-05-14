package com.example.demo.beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class HelloCdiBeanSession extends AbstractBean implements Serializable {

  private static final long serialVersionUID = -1523213805518273389L;

}
