package com.portfolio.ism.controller;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link DescripcionEducacionController}.
 */
public class DescripcionEducacionController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static DescripcionEducacionController apply(RegisteredBean registeredBean,
      DescripcionEducacionController instance) {
    instance.desceduServ = AutowiredFieldValueResolver.forRequiredField("desceduServ").resolve(registeredBean);
    return instance;
  }
}
