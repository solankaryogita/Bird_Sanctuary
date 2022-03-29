package com.bridgelab1;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {
	
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

	void  print(Set birdList) {
		for (Object bird: birdList) {
			System.out.println(bird);
		}
	}
	
	void printflyable(Set<Bird> birdSet) {
		for (Bird bird: birdSet) {
			if(bird instanceof Flyable) {
				Flyable flyableBird = (Flyable)bird;
				flyableBird.fly();
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
			if(bird instanceof Swimmable) {
				Swimmable swimmableBird = (Swimmable)bird;
				swimmableBird.swim();
			}
		}
	}
}
