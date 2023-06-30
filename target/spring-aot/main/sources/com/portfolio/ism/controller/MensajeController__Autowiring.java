package com.portfolio.ism.controller;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link MensajeController}.
 */
public class MensajeController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static MensajeController apply(RegisteredBean registeredBean, MensajeController instance) {
    instance.menServ = AutowiredFieldValueResolver.forRequiredField("menServ").resolve(registeredBean);
    return instance;
  }
}
