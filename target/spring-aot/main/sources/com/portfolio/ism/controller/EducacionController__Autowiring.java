package com.portfolio.ism.controller;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link EducacionController}.
 */
public class EducacionController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static EducacionController apply(RegisteredBean registeredBean,
      EducacionController instance) {
    instance.eduServ = AutowiredFieldValueResolver.forRequiredField("eduServ").resolve(registeredBean);
    return instance;
  }
}
