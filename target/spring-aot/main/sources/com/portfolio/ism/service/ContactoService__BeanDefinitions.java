package com.portfolio.ism.service;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ContactoService}.
 */
public class ContactoService__BeanDefinitions {
  /**
   * Get the bean definition for 'contactoService'.
   */
  public static BeanDefinition getContactoServiceBeanDefinition() {
    Class<?> beanType = ContactoService.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<ContactoService> instanceSupplier = InstanceSupplier.using(ContactoService::new);
    instanceSupplier = instanceSupplier.andThen(ContactoService__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
