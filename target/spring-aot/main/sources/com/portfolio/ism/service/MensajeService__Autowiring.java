package com.portfolio.ism.service;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link MensajeService}.
 */
public class MensajeService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static MensajeService apply(RegisteredBean registeredBean, MensajeService instance) {
    instance.menRepo = AutowiredFieldValueResolver.forRequiredField("menRepo").resolve(registeredBean);
    return instance;
  }
}
