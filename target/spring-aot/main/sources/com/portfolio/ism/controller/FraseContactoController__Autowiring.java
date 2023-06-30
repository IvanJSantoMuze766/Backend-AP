package com.portfolio.ism.controller;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link FraseContactoController}.
 */
public class FraseContactoController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static FraseContactoController apply(RegisteredBean registeredBean,
      FraseContactoController instance) {
    instance.fraconServ = AutowiredFieldValueResolver.forRequiredField("fraconServ").resolve(registeredBean);
    return instance;
  }
}
