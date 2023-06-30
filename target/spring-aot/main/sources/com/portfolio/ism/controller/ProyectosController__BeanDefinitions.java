package com.portfolio.ism.controller;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ProyectosController}.
 */
public class ProyectosController__BeanDefinitions {
  /**
   * Get the bean definition for 'proyectosController'.
   */
  public static BeanDefinition getProyectosControllerBeanDefinition() {
    Class<?> beanType = ProyectosController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<ProyectosController> instanceSupplier = InstanceSupplier.using(ProyectosController::new);
    instanceSupplier = instanceSupplier.andThen(ProyectosController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
