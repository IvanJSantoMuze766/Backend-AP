package com.portfolio.ism.service;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link SobreMiService}.
 */
public class SobreMiService__BeanDefinitions {
  /**
   * Get the bean definition for 'sobreMiService'.
   */
  public static BeanDefinition getSobreMiServiceBeanDefinition() {
    Class<?> beanType = SobreMiService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<SobreMiService> instanceSupplier = InstanceSupplier.using(SobreMiService::new);
    instanceSupplier = instanceSupplier.andThen(SobreMiService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
