package com.portfolio.ism.service;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link DescripcionEducacionService}.
 */
public class DescripcionEducacionService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static DescripcionEducacionService apply(RegisteredBean registeredBean,
      DescripcionEducacionService instance) {
    instance.desceduRepo = AutowiredFieldValueResolver.forRequiredField("desceduRepo").resolve(registeredBean);
    return instance;
  }
}
