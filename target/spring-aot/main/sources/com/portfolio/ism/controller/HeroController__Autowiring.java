package com.portfolio.ism.controller;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link HeroController}.
 */
public class HeroController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static HeroController apply(RegisteredBean registeredBean, HeroController instance) {
    instance.heroServ = AutowiredFieldValueResolver.forRequiredField("heroServ").resolve(registeredBean);
    return instance;
  }
}
