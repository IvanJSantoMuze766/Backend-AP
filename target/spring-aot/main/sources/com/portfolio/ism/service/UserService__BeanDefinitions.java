package com.portfolio.ism.service;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link UserService}.
 */
public class UserService__BeanDefinitions {
  /**
   * Get the bean definition for 'userService'.
   */
  public static BeanDefinition getUserServiceBeanDefinition() {
    Class<?> beanType = UserService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<UserService> instanceSupplier = InstanceSupplier.using(UserService::new);
    instanceSupplier = instanceSupplier.andThen(UserService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
