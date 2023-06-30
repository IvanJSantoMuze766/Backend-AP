package com.portfolio.ism.controller;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link UserController}.
 */
public class UserController__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static UserController apply(RegisteredBean registeredBean, UserController instance) {
    instance.userServ = AutowiredFieldValueResolver.forRequiredField("userServ").resolve(registeredBean);
    return instance;
  }
}
