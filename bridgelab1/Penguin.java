package com.bridgelab1;

public class Penguin extends Bird implements Swimmable {
	public Penguin(String id)
	{
		 this.id=id;
		 name= "Penguin";
		 color = Color.BLACK_WHITE;
	}

	 @Override
	 public void swim() {
		  System.out.println(getClass().getSimpleName() + " I can swim");
	  }
}