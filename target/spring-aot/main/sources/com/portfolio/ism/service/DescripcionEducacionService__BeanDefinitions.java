package com.portfolio.ism.service;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DescripcionEducacionService}.
 */
public class DescripcionEducacionService__BeanDefinitions {
  /**
   * Get the bean definition for 'descripcionEducacionService'.
   */
  public static BeanDefinition getDescripcionEducacionServiceBeanDefinition() {
    Class<?> beanType = DescripcionEducacionService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<DescripcionEducacionService> instanceSupplier = InstanceSupplier.using(DescripcionEducacionService::new);
    instanceSupplier = instanceSupplier.andThen(DescripcionEducacionService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
