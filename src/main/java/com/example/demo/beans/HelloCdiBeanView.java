package com.example.demo.beans;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.io.Serializable;

@Named
@ViewScoped
public class HelloCdiBeanView extends AbstractBean implements Serializable {

  private static final long serialVersionUID = 540532513851063738L;

}
