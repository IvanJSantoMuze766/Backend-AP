package com.portfolio.ism.controller;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link SobreMiController}.
 */
public class SobreMiController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static SobreMiController apply(RegisteredBean registeredBean, SobreMiController instance) {
    instance.sobremiServ = AutowiredFieldValueResolver.forRequiredField("sobremiServ").resolve(registeredBean);
    return instance;
  }
}
