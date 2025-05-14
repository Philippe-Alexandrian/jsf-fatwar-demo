package com.example.demo.beans;

import com.example.demo.config.ViewScopeConfig;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ViewScopeConfig.ID)
public class HelloSpringBeanView extends AbstractBean {

  private static final Logger logger = LoggerFactory.getLogger(HelloSpringBeanView.class);

  @PostConstruct
  public void init() {
    logger.debug("{}@PostConstruct", HelloSpringBeanView.class.getSimpleName());
  }

}
