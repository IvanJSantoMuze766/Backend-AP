package com.portfolio.ism.controller;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ProyectosController}.
 */
public class ProyectosController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ProyectosController apply(RegisteredBean registeredBean,
      ProyectosController instance) {
    instance.proyServ = AutowiredFieldValueResolver.forRequiredField("proyServ").resolve(registeredBean);
    return instance;
  }
}
