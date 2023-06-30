package com.portfolio.ism;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link IsmApplication}.
 */
public class IsmApplication__BeanDefinitions {
  /**
   * Get the bean definition for 'ismApplication'.
   */
  public static BeanDefinition getIsMApplicationBeanDefinition() {
    Class<?> beanType = IsmApplication.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(IsmApplication.class);
    beanDefinition.setInstanceSupplier(IsmApplication$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
