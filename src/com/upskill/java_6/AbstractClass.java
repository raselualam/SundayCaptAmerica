package com.upskill.java_6;

public abstract class AbstractClass {
	
	//Abstract class has both abstract method and regular method
	
	public abstract void iDoor();
	
	public abstract int iWheel();
	
	public void car(){
		System.out.println("My car is Audi");
	}
	
	public void engine(){
		System.out.println("My car is V6");
	}
	
}
