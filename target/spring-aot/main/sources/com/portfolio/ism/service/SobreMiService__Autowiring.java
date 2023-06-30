package com.portfolio.ism.service;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link SobreMiService}.
 */
public class SobreMiService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static SobreMiService apply(RegisteredBean registeredBean, SobreMiService instance) {
    instance.sobremiRepo = AutowiredFieldValueResolver.forRequiredField("sobremiRepo").resolve(registeredBean);
    return instance;
  }
}
