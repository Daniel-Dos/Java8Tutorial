package com.tutorialspoint.java8.methodReferences;

import java.awt.List;
import java.util.ArrayList;

/**
 * Method reference helps to point to method by their name. A method reference is described using "::"
 * symbol. A method reference can be used to point following types of methods.
 * 
 *  - static methods
 *  - Instance methods
 *  - Constructors using new operatorTreeSet::new
 * @author Daniel Dias
 *
 */

public class Java8Tester {
	
	public static void main(String[] args) {
		
		ArrayList names = new ArrayList();
		names.add("Mahesh");
		names.add("Suresh");
		names.add("Ramesh");
		names.add("Naresh");
		names.add("Kalpesh");
		
		names.forEach(System.out::println);
	}

}
