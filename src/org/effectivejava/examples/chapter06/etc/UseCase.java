package org.effectivejava.examples.chapter06.etc;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @UseCase ¼±¾ð
 *
 * @since 2016. 7. 3.
 * @author Digitanomad
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface UseCase {
	public int id();
	public String description() default "no description";
}
