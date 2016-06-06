package org.effectivejava.examples.chapter03.item12;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class WordList {
	public static void main(String[] args) {
		args = new String[4];
		args[0] = "c";
		args[1] = "b";
		args[2] = "a";
		args[3] = "a";
		
		Set<String> s = new TreeSet<String>();
		Collections.addAll(s, args);
		System.out.println(s);
	}
}
