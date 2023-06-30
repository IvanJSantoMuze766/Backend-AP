package com.portfolio.ism.controller;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SobreMiController}.
 */
public class SobreMiController__BeanDefinitions {
  /**
   * Get the bean definition for 'sobreMiController'.
   */
  public static BeanDefinition getSobreMiControllerBeanDefinition() {
    Class<?> beanType = SobreMiController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<SobreMiController> instanceSupplier = InstanceSupplier.using(SobreMiController::new);
    instanceSupplier = instanceSupplier.andThen(SobreMiController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
