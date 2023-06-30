package com.portfolio.ism.controller;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ExperienciaController}.
 */
public class ExperienciaController__BeanDefinitions {
  /**
   * Get the bean definition for 'experienciaController'.
   */
  public static BeanDefinition getExperienciaControllerBeanDefinition() {
    Class<?> beanType = ExperienciaController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<ExperienciaController> instanceSupplier = InstanceSupplier.using(ExperienciaController::new);
    instanceSupplier = instanceSupplier.andThen(ExperienciaController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
