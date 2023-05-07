package com.upskill.java_4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Array_Hashmap_Hashset_HashTable {

	public static void main(String[] args) {

		//Array store multiple data using index
		
		int ageAdil = 30;
		int[] ageCaptAmerica = new int[] {19, 28, 35, 40, 26, 25};
		
		//Array index			 		  [0] [1] [2] [3] [4] [5]
		
		System.out.println("Student Age : " + ageCaptAmerica[3]);
		System.out.println("Total Student: " + ageCaptAmerica.length);
		
		
		String nameAdil = "Adil";
		String[] nameCaptAmerica = new String[] {"Nayeem", "Sohag", "Hira", "Adil", "Saddam"};
		
		//Array index			 		  			[0] 	 [1] 	 [2] 	   [3] 		[4] 
		
		System.out.println("Student Name : " + nameCaptAmerica[3]);
		System.out.println("Total Student: " + nameCaptAmerica.length);
		
		//Multi-Dimentional Array
		int [][] ageCaptAmerica2D = {{19, 28, 35, 40}, 		//[0][0]	[0][1]	[0][2]	[0][3]
									 {36, 23, 25}};			//[1][0]	[1][1]	[1][2]
		
		System.out.println("Student Age 2D : " + ageCaptAmerica2D[0][2]);
		
		// Hashmap store multipul data using key-value pair, Implementation of Map interface
		
		HashMap<String, Integer> Student = new 	HashMap <String, Integer>();
		
		Student.put("Nayeem", 25);
		Student.put("Surzana", 30);
		Student.put("Adil", 28);
		Student.put("Beyonce", 19);
		
		System.out.println("Student Age from Hashmap : " + Student.get("Beyonce"));
		
		HashMap<String, String> Capital = new HashMap<String, String>();
		
		Capital.put("BD", "Dhaka");
		Capital.put("USA", "Washington DC");
		
		System.out.println("Capital City : " + Capital.get("BD"));	
		
		//Hashset store unordered collection containing unique value, Implementation of Set interface
		
		HashSet<String> car = new HashSet<String>();
		
		car.add("BMW");
		car.add("Audi");
		car.add("Toyota");
		car.add("Honda");
		
		System.out.println("Car : " + car);
		
		HashSet<String> country = new HashSet<String>();
		
		country.add("BD");
		country.add("USA");
		
		System.out.println("country : " + country);
		
		//HashTable store multiple data using key-value pair, No duplicate, also is synchronized (only one thread can be modified)
		
		Hashtable<String, String> Region = new Hashtable<String, String>();
				
		Region.put("BD", "Asia");
		Region.put("USA", "America");
		
		System.out.println("Region : " + Region.get("BD"));
	}
}