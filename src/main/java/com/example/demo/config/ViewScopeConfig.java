package com.example.demo.config;

import jakarta.faces.context.FacesContext;
import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.beans.factory.config.Scope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ViewScopeConfig {

  public static final String ID = "view";

  @Bean
  static CustomScopeConfigurer viewScopeConfigurer() {
    CustomScopeConfigurer configurer = new CustomScopeConfigurer();
    Map<String, Object> scopes = new HashMap<>();
    scopes.put(ID, new ViewScope());
    configurer.setScopes(scopes);
    return configurer;
  }

  private static class ViewScope implements Scope {

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
      Map<String, Object> viewMap = FacesContext.getCurrentInstance().getViewRoot().getViewMap();
      return viewMap.computeIfAbsent(name, k -> objectFactory.getObject());
    }

    @Override
    public Object remove(String name) {
      return FacesContext.getCurrentInstance().getViewRoot().getViewMap().remove(name);
    }

    @Override
    public String getConversationId() {
      return FacesContext.getCurrentInstance().getViewRoot().getViewId();
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
      // Not supported
    }

    @Override
    public Object resolveContextualObject(String key) {
      return null;
    }
  }

}
