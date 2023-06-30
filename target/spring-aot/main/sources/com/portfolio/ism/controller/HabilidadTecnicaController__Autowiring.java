package com.portfolio.ism.controller;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link HabilidadTecnicaController}.
 */
public class HabilidadTecnicaController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static HabilidadTecnicaController apply(RegisteredBean registeredBean,
      HabilidadTecnicaController instance) {
    instance.habtecServ = AutowiredFieldValueResolver.forRequiredField("habtecServ").resolve(registeredBean);
    return instance;
  }
}
