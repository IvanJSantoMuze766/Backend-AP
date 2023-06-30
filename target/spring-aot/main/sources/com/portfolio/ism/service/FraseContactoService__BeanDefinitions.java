package com.portfolio.ism.service;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link FraseContactoService}.
 */
public class FraseContactoService__BeanDefinitions {
  /**
   * Get the bean definition for 'fraseContactoService'.
   */
  public static BeanDefinition getFraseContactoServiceBeanDefinition() {
    Class<?> beanType = FraseContactoService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<FraseContactoService> instanceSupplier = InstanceSupplier.using(FraseContactoService::new);
    instanceSupplier = instanceSupplier.andThen(FraseContactoService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
