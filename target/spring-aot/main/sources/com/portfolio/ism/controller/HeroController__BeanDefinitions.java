package com.portfolio.ism.controller;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HeroController}.
 */
public class HeroController__BeanDefinitions {
  /**
   * Get the bean definition for 'heroController'.
   */
  public static BeanDefinition getHeroControllerBeanDefinition() {
    Class<?> beanType = HeroController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<HeroController> instanceSupplier = InstanceSupplier.using(HeroController::new);
    instanceSupplier = instanceSupplier.andThen(HeroController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
