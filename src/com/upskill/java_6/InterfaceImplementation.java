package com.upskill.java_6;

public class InterfaceImplementation implements Interface{

	@Override
	public void iDoor() {
		System.out.println("My car has 2 door !");
		
	}

	@Override
	public int iWheel() {
		System.out.println("My car has 4 wheel !");
		return 4;
	}

	@Override
	public int iSeat() {
		System.out.println("My car has 4 seat !");
		return 4;
	}

	@Override
	public String iColor() {
		System.out.println("My car is Black");
		return "Black";
	}

}
