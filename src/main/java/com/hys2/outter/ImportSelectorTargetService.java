package com.hys2.outter;

import java.util.Map;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.hys.spring4demo.TestLog;
import com.hys.spring4demo.importselector.EnableImportSelectorTest;

public class ImportSelectorTargetService implements ImportBeanDefinitionRegistrar{

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		Map<String, Object> attrs = importingClassMetadata.getAnnotationAttributes(EnableImportSelectorTest.class.getTypeName());
		TestLog.printRootLog("ImportSelectorTargetService:"+attrs.toString());
		
	}

}
