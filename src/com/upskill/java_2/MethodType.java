package com.upskill.java_2;

public class MethodType {
	
/* 	Types of Methods
	 
	1.Void Method - It will not return any data
	2.Static Method - Belong to class, don't have to create object. 
	3.Return Type Method - Must return a data.
 */
	static int hourlyIncome = 90;

	public static void main(String[] args) {
		
		MethodType obj = new MethodType();
		obj.annualIncome();
		weeklyIncome();
		System.out.println("My Monthly Income = " + monthlyIncome());
		
		System.out.println("My name = " + obj.name());
	}
	
	//Void Method
	public void annualIncome(){
		int calculateAnnualIncome = hourlyIncome *2000;
		System.out.println("My Annual Income = " + calculateAnnualIncome);
	}

	//Static Method
	public static void weeklyIncome(){
		int calculateWeeklyIncome = hourlyIncome *40;
		System.out.println("My Weekly Income = " + calculateWeeklyIncome);
	}
	
	//Return Type Method
	public static int monthlyIncome(){
		int calculateMonthlyIncome = hourlyIncome * 180;
		return calculateMonthlyIncome;
	}	
	
	public String name(){
		String myName = "Rasel";
		return myName;
	}
	
	public boolean good(){
		return false;
	}
}