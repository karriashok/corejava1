package com.java8;

import java.util.Optional;

public class optionalProgram {

	public static void main(String[] args) {
		String str[]=new String [10];
		str[1]="Ashok";
		Optional<String> o=Optional.ofNullable(str[0]);
		if (o.isPresent()) {
		System.out.println(str[0].length());
		}
		else {
			System.out.println("String is null");
		}
		System.out.println("Max number of letters peresnt in the word is "+str[1].length());
		System.out.println("statement 1");
		System.out.println("statement 2");
		System.out.println("statement 3");
		System.out.println("statement 4");
	}

}
