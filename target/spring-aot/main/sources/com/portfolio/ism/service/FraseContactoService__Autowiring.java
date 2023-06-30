package com.portfolio.ism.service;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link FraseContactoService}.
 */
public class FraseContactoService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static FraseContactoService apply(RegisteredBean registeredBean,
      FraseContactoService instance) {
    instance.fraconRepo = AutowiredFieldValueResolver.forRequiredField("fraconRepo").resolve(registeredBean);
    return instance;
  }
}
