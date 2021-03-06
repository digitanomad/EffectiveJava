package org.effectivejava.examples.chapter06.item35;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Marker annotation type declaration - Page 169
 * Indicates that the annotated method is a test method.
 * Use only on parameterless static methods.
 *
 * @since 2016. 7. 3.
 * @author Digitanomad
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}
