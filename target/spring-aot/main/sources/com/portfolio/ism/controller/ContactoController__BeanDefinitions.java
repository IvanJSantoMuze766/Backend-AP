package com.portfolio.ism.controller;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ContactoController}.
 */
public class ContactoController__BeanDefinitions {
  /**
   * Get the bean definition for 'contactoController'.
   */
  public static BeanDefinition getContactoControllerBeanDefinition() {
    Class<?> beanType = ContactoController.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    InstanceSupplier<ContactoController> instanceSupplier = InstanceSupplier.using(ContactoController::new);
    instanceSupplier = instanceSupplier.andThen(ContactoController__Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
