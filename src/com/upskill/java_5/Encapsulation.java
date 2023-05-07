package com.upskill.java_5;

public class Encapsulation {
	
	//Encapsulation used to hide the data using setter and getter method
	
	
	private String name = "Saddam";				//write & read 
	private int ssn = 12345678;					//write only access
	private String username = "Userkhan";		//read only access
	
	
	//Setter Method - name						//set the data, Write
	public void setName(String value){
		name = value;
	}
	
	//Getter Method - name						//get the data, Read
	public String getName(){
		return name;
	}
	
	//Setter Method - ssn						//set the data, Write
	public void setSSN(int value){
		ssn = value;
	}
	
	//Getter Method - username						//get the data, Read
	public String getUserName(){
		return username;
	}

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		
		obj.setName("Mr. Khan");
		System.out.println(obj.getName());
		
		obj.setSSN(99889998);
		System.out.println(obj.getUserName());
		
	}
}