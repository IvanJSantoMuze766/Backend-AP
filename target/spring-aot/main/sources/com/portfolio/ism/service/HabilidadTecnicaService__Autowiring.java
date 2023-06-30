package com.portfolio.ism.service;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link HabilidadTecnicaService}.
 */
public class HabilidadTecnicaService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static HabilidadTecnicaService apply(RegisteredBean registeredBean,
      HabilidadTecnicaService instance) {
    instance.habtecRepo = AutowiredFieldValueResolver.forRequiredField("habtecRepo").resolve(registeredBean);
    return instance;
  }
}
