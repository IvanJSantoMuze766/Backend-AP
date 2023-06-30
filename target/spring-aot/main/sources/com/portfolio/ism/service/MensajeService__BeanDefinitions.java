package com.portfolio.ism.service;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MensajeService}.
 */
public class MensajeService__BeanDefinitions {
  /**
   * Get the bean definition for 'mensajeService'.
   */
  public static BeanDefinition getMensajeServiceBeanDefinition() {
    Class<?> beanType = MensajeService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<MensajeService> instanceSupplier = InstanceSupplier.using(MensajeService::new);
    instanceSupplier = instanceSupplier.andThen(MensajeService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
