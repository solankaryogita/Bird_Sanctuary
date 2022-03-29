package com.bridgelab1;

public class Parrot extends Bird implements Flyable{
	public Parrot(String id)
	{
		 this.id=id;
		 name= "Parrot";
		 color = color.RED;
	}
	
	@Override
	public void fly() {
		  System.out.println(getClass().getSimpleName() + " I can fly");
	}
	

}
