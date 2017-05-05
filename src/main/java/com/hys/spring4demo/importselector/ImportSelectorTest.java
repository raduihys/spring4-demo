package com.hys.spring4demo.importselector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import com.hys2.outter.ImportSelectorTargetService;

public class ImportSelectorTest implements ImportSelector{

	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{ImportSelectorTargetService.class.getName()};
	}
	
}
