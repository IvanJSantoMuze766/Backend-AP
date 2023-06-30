package com.portfolio.ism.service;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ExperienciaService}.
 */
public class ExperienciaService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ExperienciaService apply(RegisteredBean registeredBean,
      ExperienciaService instance) {
    instance.expeRepo = AutowiredFieldValueResolver.forRequiredField("expeRepo").resolve(registeredBean);
    return instance;
  }
}
