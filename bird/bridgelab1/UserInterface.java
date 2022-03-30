package com.bridgelab1;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	private static UserInterface instance;
	
	int showMainMenu() {
		System.out.println(" Enter 1: Add Bird");
		System.out.println("2: Remove Bird");
		System.out.println("3: Edit Bird");
		System.out.println("4: Print Bird");
		System.out.println(Main.MAINEXIT + ": Exit Bird");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		return option;
	}
	
	public static int showupdateMainMenu() {
		System.out.println("Enter 1: update id");
		System.out.println(" 2: update name");
		System.out.println(" 3: update color");
		Scanner scanner = new Scanner(System.in);
		int option = scanner.nextInt();
		return option;
	}
	
	 private UserInterface() {
		
	}
	 
	 static synchronized UserInterface getInstance() {
		   if(instance == null) {
			   instance = new UserInterface();
		   }
		   return instance;
	   }

	void  print(Set birdList) {
		for (Object bird: birdList) {
			System.out.println(bird);
		}
	}
	
	void printflyable(Set<Bird> birdSet) {
		for (Bird bird: birdSet) {
			if(bird.isFlyable) {
				System.out.println(bird.name + " Bird can fly ");
			}
		}
	}
	
	void printeatable(Set<Bird> birdSet) {
		for (Bird bird: birdSet) {
			  bird.eat(); 
			  System.out.println(bird);
		}
	}
	
	void printswimable(Set<Bird> birdSet) {
		for (Bird bird: birdSet) {
			if(bird.isSwimmable) {
				System.out.println(bird.name + " Bird can swim ");
			}
		}
	}
}
