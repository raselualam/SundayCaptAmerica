package com.upskill.java_7;

public class MultiThreading {
	
	/* Multithreading is a Java feature that allows concurrent execution of two or more parts of a program.
	
	Threads can be created by using two mechanisms : 

		1. Extending the Thread class 
		2. Implementing the Runnable Interface */

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++){
			MultithreadingThread obj = new MultithreadingThread();
			obj.start();
			
			Thread obj2 = new Thread(new MultithreadingRunable());
			obj2.start();
		}
	}
}