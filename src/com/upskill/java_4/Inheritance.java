package com.upskill.java_4;

import com.upskill.java_2.MethodType;

public class Inheritance extends MethodType {

	/* The process of obtaining the data members and methods from one class to another class is known as inheritance.
	-	Single Inheritance
	-	Multiple Inheritance	(Java doesn't support Multiple Inheritance directly rather through Interfaces)
	-	Multilevel Inheritance

	*/
	
	public static void main(String[] args) {

		Inheritance obj = new Inheritance();
		
		obj.annualIncome();
		obj.weeklyIncome();	
		System.out.println("My Monthly Income = " + monthlyIncome());
	}
}
