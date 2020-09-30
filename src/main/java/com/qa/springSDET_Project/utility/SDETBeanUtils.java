package com.qa.springSDET_Project.utility;

import org.springframework.beans.BeanUtils;

import ch.qos.logback.core.joran.util.beans.BeanUtil;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SDETBeanUtils {
	
	public static void mergeObject(Object soureObject, Object targetObject) {
		BeanUtils.copyProperties(soureObject, targetObject);
	}

}
