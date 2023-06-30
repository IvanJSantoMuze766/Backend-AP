package com.portfolio.ism.controller;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ContactoController}.
 */
public class ContactoController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ContactoController apply(RegisteredBean registeredBean,
      ContactoController instance) {
    instance.conServ = AutowiredFieldValueResolver.forRequiredField("conServ").resolve(registeredBean);
    return instance;
  }
}
