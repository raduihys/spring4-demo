
package com.hys.spring4demo.registrar;

import java.util.Properties;

import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

class EnableTestImportRegistrar implements ImportBeanDefinitionRegistrar {
	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
//		Map<String, Object> attrs = importingClassMetadata.getAnnotationAttributes(EnableTest.class.getTypeName());
		Properties oumsClientConfigProperties = new Properties();
		oumsClientConfigProperties.put("a1", "a11111111");
		oumsClientConfigProperties.put("a2", "a22222222");
		BeanDefinitionBuilder configPropertisBean=BeanDefinitionBuilder.genericBeanDefinition(PropertiesFactoryBean.class);
		configPropertisBean.addPropertyValue("properties", oumsClientConfigProperties);
		registry.registerBeanDefinition("xvtest", configPropertisBean.getBeanDefinition());
		System.out.println("dddddddddddddd");

	}




}
