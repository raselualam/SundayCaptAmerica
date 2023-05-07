package com.upskill.java_7;

public class Singleton {
	
	// Singleton is class that can have only one object

	// Private constructor, it prevents any other class from instantiating
	private Singleton(){
		
	}
	
	//Private static object of the class
	private static Singleton SingletonObj = new Singleton();
	
	
	public static Singleton getInstance(){
		return SingletonObj;
	}
	
	protected static void goldSuhag(){
		System.out.println("Suhag bhai's Gold");
	}
	
	protected static void silverSaddam(){
		System.out.println("Saddam bhai's Silver");
	}
}
