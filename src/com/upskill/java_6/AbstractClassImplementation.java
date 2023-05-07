package com.upskill.java_6;

public class AbstractClassImplementation extends AbstractClass{

	@Override
	public void iDoor() {
		System.out.println("My car has 2 door !");
		
	}

	@Override
	public int iWheel() {
		System.out.println("My car has 4 wheel !");
		return 4;
	}
	
	
	
	/*
	(Parent)				   			(Keyword) 		(Child)	
									
	Class (Ar Br)						extends			Class (Ar Br)
	Abstract Class (Ar Br Ca Da)	   	extends			Class (Ar Br Cr Dr)
	Interface (Ca Da)					implements		Class (Cr Dr)
	Interface (Ca Da)					extends			Interface (Ca Da Ea Fa)			implements        class (Cr Dr Er Fr)
	Interface (Ca Da)					implements		Abstract Class (Cr Dr)
	*/

}
