package com.portfolio.ism.controller;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DescripcionEducacionController}.
 */
public class DescripcionEducacionController__BeanDefinitions {
  /**
   * Get the bean definition for 'descripcionEducacionController'.
   */
  public static BeanDefinition getDescripcionEducacionControllerBeanDefinition() {
    Class<?> beanType = DescripcionEducacionController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<DescripcionEducacionController> instanceSupplier = InstanceSupplier.using(DescripcionEducacionController::new);
    instanceSupplier = instanceSupplier.andThen(DescripcionEducacionController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
