package com.upskill.java_2;

public class Variables {

	String country = "USA";	//Instance OR global variable - Variables declared in Class level, outside method
	
	static String region = "America"; //Static variable - variables belong to class and don't required creating object
	
	public static void main(String[] args) {
		String city = "NYC";
		System.out.println(city);
		
		System.out.println(region);
		
		Variables obj = new Variables();		//ClassName ObjectName = new classname()
		System.out.println(obj.country);
		
		obj.Colorado("Sussex");
		obj.newjersey("Essex");

		student("Daneal", 30);
		student("Tarek", 35);
		student("Saker", 25);
	}
	
	public void newjersey(String county){
		String city = "Bloomfield";
		System.out.println(city);				//Local variable - variables declared in methods 
		System.out.println(country);
		System.out.println(county);
	}
	
	public void Colorado(String county){	//Method parameter - variables used as method parameter, pass value
		String city = "Denvar";
		System.out.println(city);
		System.out.println(country);
		System.out.println(county);
	}
	
	public static void student(String name, int age){
		System.out.println(name);
		System.out.println(age);
	}

}
