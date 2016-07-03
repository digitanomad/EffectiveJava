package org.effectivejava.examples.chapter06.etc;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 어노테이션을 적용한 PasswordUtils 클래스를 읽고 리플렉션을 사용하여
 * UseCase를 검색하는 어노테이션 프로세스
 * 
 * @since 2016. 7. 3.
 * @author Digitanomad
 */
public class UseCaseTracker {
	
	public static void trackUseCases(List<Integer> useCases, Class<?> cl) {
		for (Method m : cl.getDeclaredMethods()) {
			UseCase uc = m.getAnnotation(UseCase.class);
			if (uc != null) {
				System.out.println("Found Use Case : " + uc.id() + " " + uc.description());
				useCases.remove(new Integer(uc.id()));
			}
		}
		
		for (int i : useCases) {
			System.out.println("Warning : Missing use case-" + i);
		}
	}
	
	public static void main(String[] args) {
		List<Integer> useCases = new ArrayList<Integer>();
		Collections.addAll(useCases, 47, 48, 49, 50);
		trackUseCases(useCases, PasswordUtils.class);
	}
}
