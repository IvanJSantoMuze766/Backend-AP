package com.portfolio.ism.service;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HabilidadTecnicaService}.
 */
public class HabilidadTecnicaService__BeanDefinitions {
  /**
   * Get the bean definition for 'habilidadTecnicaService'.
   */
  public static BeanDefinition getHabilidadTecnicaServiceBeanDefinition() {
    Class<?> beanType = HabilidadTecnicaService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<HabilidadTecnicaService> instanceSupplier = InstanceSupplier.using(HabilidadTecnicaService::new);
    instanceSupplier = instanceSupplier.andThen(HabilidadTecnicaService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
