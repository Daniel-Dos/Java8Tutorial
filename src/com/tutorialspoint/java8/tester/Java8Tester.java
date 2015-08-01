package com.tutorialspoint.java8.tester;

import java.util.ArrayList;

// Java 8 - OverView

// ordenando em java 7 e ordenando em java 8



import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8Tester {
  
  public static void main(String[] args) {
  
   List<String> names1 = new ArrayList<String>();
   names1.add("Mahesh");
   names1.add("Suresh");
   names1.add("Ramesh");
   names1.add("Naresh");
   names1.add("Kalpesh");
   
   List<String> names2 = new ArrayList<String>();
   
   names2.add("Mahesh");
   names2.add("Suresh");
   names2.add("Ramesh");
   names2.add("Naresh");
   names2.add("Kalpesh");
   
   Java8Tester tester = new Java8Tester();
   
   //ordenando no java 7 
   System.out.println("Sort using Java 7 syntax: ");
   tester.sortUsingJava7(names1);
   System.out.println(names1);
   
   System.out.println("Sort using Java 8 syntax: ");
   tester.sortUsingJava8(names2);
   System.out.println(names2);
   
   
  
  }
  
  //metodos de ordenação
   private void sortUsingJava7(List<String> names) {
   
      //sort using java 7 
	  Collections.sort(names, new Comparator<String>() {
	    
		public int compare(String s1, String s2) {
		 return s1.compareTo(s2);
		}
	  
	  });
	
   }
   
   //sort using java 8
   private void sortUsingJava8(List<String> names) {
     //sort using java8 
	 Collections.sort(names, (s1 , s2) -> s1.compareTo(s2));
   
   }



}