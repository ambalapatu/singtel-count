package com.example.rest.model;

public class Animal {
	
	private static int countInstance;
 
	  public Animal() {
	    countInstance++;
	  }
 
	  public static int getInstanceCount() {
	    return countInstance;
	  }
    
}
