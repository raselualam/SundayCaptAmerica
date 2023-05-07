package com.upskill.java_5;

import com.upskill.java_2.MethodType;

public class Polymorphism extends MethodType{
	
/* Polymorphism is the ability of an object to take on many forms.
	- Method Overloading (Compile time Polymorphism/Static binding) Same method name with different signature to overload
	- Method Overridding (Runtime Polymorphism/Dynamic binding) Same method name from Parent class to override
*/

	public static void main(String[] args) {
		car("BMW", 2022);
		
		Polymorphism obj = new Polymorphism();
		obj.annualIncome();
		
	}
	
	
	//Method Overriding - Runtime Polymorphism - Dynamic binding
	//Same method name from Parent class to override
	
	public void annualIncome(){
		int calculateAnnualIncome = 95 *2000 + 50000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}
	

	//Method Overloading - Compile time Polymorphism - Static binding
	//Same method name with different signature
	
	public static void car(){
		System.out.println("I have a car");
	}
	
	public static void car(String brand){
		System.out.println("I have a car, its brand " + brand);
	}

	public static void car(int year){
		System.out.println("I have a car, its year made " + year);
	}
	
	public static void car(String brand, int year){
		System.out.println("I have a car, its brand " + brand + ", its year made " + year);
	}
	
	public static void car(int year, String brand){
		System.out.println("I have a car, its year made " + year + ", its brand " + brand);
	}
}