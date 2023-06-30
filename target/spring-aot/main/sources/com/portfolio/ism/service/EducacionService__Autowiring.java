package com.portfolio.ism.service;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link EducacionService}.
 */
public class EducacionService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static EducacionService apply(RegisteredBean registeredBean, EducacionService instance) {
    instance.eduRepo = AutowiredFieldValueResolver.forRequiredField("eduRepo").resolve(registeredBean);
    return instance;
  }
}
