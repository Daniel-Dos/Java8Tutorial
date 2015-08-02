package com.tutorialspoint.java8.scope;

/**
 * 
 * In lambda expression, you can refer to any final variable or effectively final variable
 * {@code whichisassignedonlyonce}. Lambda expression will throw compilation error if variable 
 * is assigned a value second time.
 * 
 */

public class Java8Tester {
	
	
	final static String salutation = "Hello !";
	
	public static void main(String[] args) {
		
		GreetingService greetService1 = message -> System.out.println(salutation + message);
		greetService1.sayMessage("Mahesh");
		
	}
	
	interface GreetingService {
		void sayMessage(String message);
	}
	
}


