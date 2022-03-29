package com.bridgelab1;

public class Duck extends Bird implements Flyable, Swimmable{
	public Duck(String id)
	{
		 this.id=id;
		 name= "Duck";
		 color = Color.WHITE;
	}
		@Override	
		public void fly() {
			System.out.println(getClass().getSimpleName() + " I can fly");	}
		

		@Override
		public void swim() {
			System.out.println(getClass().getSimpleName() + " I can not swim");	}
		}

