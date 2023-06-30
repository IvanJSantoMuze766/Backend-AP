package com.portfolio.ism.service;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ContactoService}.
 */
public class ContactoService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ContactoService apply(RegisteredBean registeredBean, ContactoService instance) {
    instance.contactRepo = AutowiredFieldValueResolver.forRequiredField("contactRepo").resolve(registeredBean);
    return instance;
  }
}
