package com.portfolio.ism.controller;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ExperienciaController}.
 */
public class ExperienciaController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ExperienciaController apply(RegisteredBean registeredBean,
      ExperienciaController instance) {
    instance.expeServ = AutowiredFieldValueResolver.forRequiredField("expeServ").resolve(registeredBean);
    return instance;
  }
}
