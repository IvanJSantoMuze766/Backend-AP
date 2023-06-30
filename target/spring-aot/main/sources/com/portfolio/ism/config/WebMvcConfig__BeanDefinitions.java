package com.portfolio.ism.config;

import java.lang.Class;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ConfigurationClassUtils;

/**
 * Bean definitions for {@link WebMvcConfig}.
 */
public class WebMvcConfig__BeanDefinitions {
  /**
   * Get the bean definition for 'webMvcConfig'.
   */
  public static BeanDefinition getWebMvcConfigBeanDefinition() {
    Class<?> beanType = WebMvcConfig.class;
    RootBeanDefinition beanDefinition = new RootBeanDefinition(beanType);
    ConfigurationClassUtils.initializeConfigurationClass(WebMvcConfig.class);
    beanDefinition.setInstanceSupplier(WebMvcConfig$$SpringCGLIB$$0::new);
    return beanDefinition;
  }
}
