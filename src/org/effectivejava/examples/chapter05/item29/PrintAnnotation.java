package org.effectivejava.examples.chapter05.item29;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;

/**
 * Use of asSubclass to safely cast to a bounded type token - Page 146
 *
 * @since 2016. 6. 26.
 * @author Digitanomad
 */
public class PrintAnnotation {
	// Use of asSubclass to safely cast to a bounded type token
	static Annotation getAnnotation(AnnotatedElement element, String annotationTypeName) {
		Class<?> annotationType = null;	// Unbounded type token
		try {
			annotationType = Class.forName(annotationTypeName);
		} catch (Exception ex) {
			throw new IllegalArgumentException(ex);
		}
		
		return element.getAnnotation(annotationType.asSubclass(Annotation.class));
	}
	
	// Test program to print named annotation of named class
	public static void main(String[] args) throws Exception {
		String className = "java.lang.String";
		String annotationTypeName = "java.lang.SuppressWarnings";
		Class<?> klass = Class.forName(className);
		System.out.println(getAnnotation(klass, annotationTypeName));
	}
}
