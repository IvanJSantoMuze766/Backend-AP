package com.portfolio.ism.controller;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EducacionController}.
 */
public class EducacionController__BeanDefinitions {
  /**
   * Get the bean definition for 'educacionController'.
   */
  public static BeanDefinition getEducacionControllerBeanDefinition() {
    Class<?> beanType = EducacionController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<EducacionController> instanceSupplier = InstanceSupplier.using(EducacionController::new);
    instanceSupplier = instanceSupplier.andThen(EducacionController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
