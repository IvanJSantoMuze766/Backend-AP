package com.portfolio.ism.service;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link HeroService}.
 */
public class HeroService__BeanDefinitions {
  /**
   * Get the bean definition for 'heroService'.
   */
  public static BeanDefinition getHeroServiceBeanDefinition() {
    Class<?> beanType = HeroService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<HeroService> instanceSupplier = InstanceSupplier.using(HeroService::new);
    instanceSupplier = instanceSupplier.andThen(HeroService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
