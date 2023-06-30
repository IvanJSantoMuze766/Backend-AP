package com.portfolio.ism.controller;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HabilidadTecnicaController}.
 */
public class HabilidadTecnicaController__BeanDefinitions {
  /**
   * Get the bean definition for 'habilidadTecnicaController'.
   */
  public static BeanDefinition getHabilidadTecnicaControllerBeanDefinition() {
    Class<?> beanType = HabilidadTecnicaController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<HabilidadTecnicaController> instanceSupplier = InstanceSupplier.using(HabilidadTecnicaController::new);
    instanceSupplier = instanceSupplier.andThen(HabilidadTecnicaController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
