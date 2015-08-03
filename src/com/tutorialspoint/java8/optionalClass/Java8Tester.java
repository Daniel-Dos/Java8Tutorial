package com.tutorialspoint.java8.optionalClass;

import java.util.Optional;

//Optional Class

public class Java8Tester {
	public static void main(String[] args) {
		
		Java8Tester tester = new Java8Tester();
		
		Integer value1 = null;
		Integer value2 = new Integer(10);
		
		//Optional.ofNullable - allows passed parameter to be null.
		Optional<Integer> a = Optional.ofNullable(value1);
		
		//Optional.of = throws NullPointException if passed parameter is null
		Optional<Integer> b = Optional.of(value2);
		
		System.out.println(tester.sum(a,b));
		
		
	}
	
	public Integer sum(Optional<Integer> a, Optional<Integer> b) {
		//Optinal.isPresent - checks the value is present or not
		System.out.println("First parameter is present: " + a.isPresent());
		
		System.out.println("Second parameter is present: " + b.isPresent());
		
		//Optional.orElse - return the value if present otherwise returns
		//the default value passed.
		Integer value1 = a.orElse(new Integer(0));
		
		//Optinal.get - gets the value, value should be present
		Integer value2 = b.get();
		
		return value1 + value2;
	}

}
