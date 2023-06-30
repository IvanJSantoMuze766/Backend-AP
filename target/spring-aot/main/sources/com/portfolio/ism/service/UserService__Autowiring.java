package com.portfolio.ism.service;

import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link UserService}.
 */
public class UserService__Autowiring {
  /**
   * Apply the autowiring.
   */
  public static UserService apply(RegisteredBean registeredBean, UserService instance) {
    instance.userRepo = AutowiredFieldValueResolver.forRequiredField("userRepo").resolve(registeredBean);
    return instance;
  }
}
