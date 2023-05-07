package com.upskill.java_5;

public class Constructor {
	
	/*Constructor is instance of class, method same as class name, java will execute constructor first
	- 	Constructor cannot be static or override nor void or return type.
	- 	Default Constructor : No constructor is initialized
	- 	Parameterized Constructor : Add different signature
	-	Constructor overloading : Different signature
	*/
	
	int studentAge;
	String studentName;
	String studentAddress;
	
	public Constructor(int age){
		studentAge = age;
	}
	
	public Constructor(int age, String name){
		studentAge = age;
		studentName = name;
	}
	
	public Constructor(int age, String name, String address){
		studentAge = age;
		studentName = name;
		studentAddress =  address;
	}
	
	public static void main(String[] args) {
		
		Constructor obj = new Constructor(25);
		System.out.println(obj.studentAge);
		
		Constructor obj2 = new Constructor(30, "Suhag");
		System.out.println(obj2.studentAge);
		System.out.println(obj2.studentName);
		
		Constructor obj3 = new Constructor(30, "Riza", "NJ");
		System.out.println(obj3.studentAge);
		System.out.println(obj3.studentName);
		System.out.println(obj3.studentAddress);
	}

}
