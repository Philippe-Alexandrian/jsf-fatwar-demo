package com.example.demo;

import jakarta.inject.Named;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
// ExcludeFilters needed in order for Spring not to scan Cdi Bean.
@ComponentScan(basePackages = "com.example.demo", excludeFilters = { @Filter(type = FilterType.ANNOTATION, classes = Named.class) })
public class DemoApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

}
