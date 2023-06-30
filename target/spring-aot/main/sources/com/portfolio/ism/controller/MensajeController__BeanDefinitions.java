package com.portfolio.ism.controller;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MensajeController}.
 */
public class MensajeController__BeanDefinitions {
  /**
   * Get the bean definition for 'mensajeController'.
   */
  public static BeanDefinition getMensajeControllerBeanDefinition() {
    Class<?> beanType = MensajeController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<MensajeController> instanceSupplier = InstanceSupplier.using(MensajeController::new);
    instanceSupplier = instanceSupplier.andThen(MensajeController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
