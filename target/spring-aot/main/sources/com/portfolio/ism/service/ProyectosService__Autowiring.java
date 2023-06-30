package com.portfolio.ism.service;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ProyectosService}.
 */
public class ProyectosService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ProyectosService apply(RegisteredBean registeredBean, ProyectosService instance) {
    instance.proyRepo = AutowiredFieldValueResolver.forRequiredField("proyRepo").resolve(registeredBean);
    return instance;
  }
}
