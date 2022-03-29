package com.bridgelab1;

public class Peacock extends Bird implements Flyable{
	public Peacock(String id)
	{
		 this.id=id;
		 name= "Peacock";
		 color = Color.GREEN;
	}
	
	@Override
	public void fly() {
		  System.out.println(getClass().getSimpleName() + " I can fly");
	}
	
}
