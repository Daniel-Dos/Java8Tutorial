package com.tutorialspoint.java8.lambdaExpressions;

//java 8 Lambda Expressions
//sintaxe  = parameter -> expresison body

/*
 Following are the important characterisc of a lambda expression
 
 1 - Optional type declaration = No need to declare type of the
 parameter. Compiler can inference the same from value of the parameter
 
 2 - Optional paranthesis around parameter - No need to declare a single parameter in paranthesis. for multile parameters, paranthesis are required.
 
 3 - Optional curly braces - No need to use curly braces in expresison body if body contains a single statement.
 
 4 - Optional return keyword = compiler automatically returns value if body has a single expresison to return value. Curly braces are required to indicate that expression returns a value.
*/

//exempplo

public class Java8Tester {

  public static void main(String[] args) {
  
    Java8Tester tester = new Java8Tester();
	
	//with type declaration
	
    MathOperation additon = (int a , int b) -> a + b;
    
    //with out type declaration
    MathOperation subtraction = (a,b) -> a - b;
    
    //with return statement along with curly braces
    MathOperation multiplication = (int a, int b) -> {return a * b;};
    
    //without return statement and without curly brases
    MathOperation division  = (int a, int b) -> a / b ;
    
    System.out.println("10 + 5 = " + tester.operate(10,5,additon));
    System.out.println("10 - 5 = " + tester.operate(10,5,subtraction));
    System.out.println("10 x 5 = " + tester.operate(10,5,multiplication));
    System.out.println("10 / 5 = " + tester.operate(10,5,division));
    
    // whit paranthesis
    GreetingService greetService1 = message -> System.out.println("Hello " + message);
    
    //without parenthesis
    GreetingService greetService2 = (message) -> System.out.println("Hello " + message);
    
    greetService1.sayMessage("Mahesh");
    greetService2.sayMessage("Suresh");
    
	
  
  }
  
  interface MathOperation {
	  int operation(int a , int b);
  }
  
  interface GreetingService {
	  void sayMessage(String message);
  }
  
  private int operate(int a , int b, MathOperation mathOperation) {
	  return mathOperation.operation(a, b);
  }



}
