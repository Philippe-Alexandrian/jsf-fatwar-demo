package com.example.demo;

import com.sun.faces.config.ConfigureListener;
import com.sun.faces.config.FacesInitializer;
import jakarta.faces.webapp.FacesServlet;
import jakarta.inject.Named;
import jakarta.servlet.ServletContainerInitializer;
import jakarta.servlet.ServletRegistration;
import org.jboss.weld.environment.servlet.EnhancedListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.jsf.el.SpringBeanFacesELResolver;

@SpringBootApplication
// ExcludeFilters needed in order for Spring not to scan Cdi Bean.
@ComponentScan(basePackages = "com.example.demo", excludeFilters = { @Filter(type = FilterType.ANNOTATION, classes = Named.class) })
public class DemoApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Bean
  ServletContextInitializer servletContextInitializer() {
    return servletContext -> {
      servletContext.setInitParameter("jakarta.faces.PROJECT_STAGE", "Development");

      // Better register manually and immediately FacesServlet than uses @FacesConfig
      // And ensure that in any cases, FacesServlet will registered.
      ServletRegistration.Dynamic facesServletRegistration = servletContext.addServlet("FacesServlet", new FacesServlet());
      facesServletRegistration.setLoadOnStartup(1);
      facesServletRegistration.addMapping("*.xhtml");

      // @HINT Needed in order to have CDI working into springboot fat war context.
      EnhancedListener cdiInitializer = new EnhancedListener();
      cdiInitializer.onStartup(null, servletContext);

      // JSF initializer.
      ServletContainerInitializer facesInitializer = new FacesInitializer();
      facesInitializer.onStartup(null, servletContext);

    };
  }

  // JSF servlet configuration.
  @Bean
  ServletListenerRegistrationBean<ConfigureListener> configureListener() {
    return new ServletListenerRegistrationBean<>(new ConfigureListener());
  }

  @Bean
  ServletListenerRegistrationBean<RequestContextListener> requestContextListener() {
    return new ServletListenerRegistrationBean<>(new RequestContextListener());
  }

  // TODO Needed ?
  @Bean
  SpringBeanFacesELResolver springBeanFacesELResolver() {
    return new SpringBeanFacesELResolver();
  }

}
