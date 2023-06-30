package com.portfolio.ism.service;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ProyectosService}.
 */
public class ProyectosService__BeanDefinitions {
  /**
   * Get the bean definition for 'proyectosService'.
   */
  public static BeanDefinition getProyectosServiceBeanDefinition() {
    Class<?> beanType = ProyectosService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<ProyectosService> instanceSupplier = InstanceSupplier.using(ProyectosService::new);
    instanceSupplier = instanceSupplier.andThen(ProyectosService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
