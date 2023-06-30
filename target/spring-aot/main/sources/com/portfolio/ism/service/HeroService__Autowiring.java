package com.portfolio.ism.service;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link HeroService}.
 */
public class HeroService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static HeroService apply(RegisteredBean registeredBean, HeroService instance) {
    instance.heroRepo = AutowiredFieldValueResolver.forRequiredField("heroRepo").resolve(registeredBean);
    return instance;
  }
}
