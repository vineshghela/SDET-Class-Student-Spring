package com.qa.springSDET_Project.utility;

import java.beans.PropertyDescriptor;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;


public class SDETBeanUtils {
	
	public static void mergeNotNull(Object soureObject, Object targetObject) {
		BeanUtils.copyProperties(soureObject, targetObject,getNullPropertyNames(soureObject));
	}
	
	 private static String[] getNullPropertyNames(Object soureObject) {
	        final BeanWrapper wrappedSourceObject = new BeanWrapperImpl(soureObject);

	        Set<String> propertyNames = new HashSet<>();
	        for (PropertyDescriptor propertyDescriptors : wrappedSourceObject.getPropertyDescriptors()) {
	            if (wrappedSourceObject.getPropertyValue(propertyDescriptors.getName()) == null)
	                propertyNames.add(propertyDescriptors.getName());
	        }
	        return propertyNames.toArray(new String[propertyNames.size()]);
	    }

}
