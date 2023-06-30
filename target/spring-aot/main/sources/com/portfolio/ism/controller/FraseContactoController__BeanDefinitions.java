package com.portfolio.ism.controller;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link FraseContactoController}.
 */
public class FraseContactoController__BeanDefinitions {
  /**
   * Get the bean definition for 'fraseContactoController'.
   */
  public static BeanDefinition getFraseContactoControllerBeanDefinition() {
    Class<?> beanType = FraseContactoController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<FraseContactoController> instanceSupplier = InstanceSupplier.using(FraseContactoController::new);
    instanceSupplier = instanceSupplier.andThen(FraseContactoController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
