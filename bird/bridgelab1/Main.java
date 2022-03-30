package com.bridgelab1;

import java.util.Scanner;

public class Main {
	static final int MAINEXIT = 5;
	
	//BirdRepository birdrepository =  BirdRepository.getInstance();
	//UserInterface ui =  UserInterface.getInstance();
	Scanner scanner = new Scanner(System.in);
	
	void addBird() {
		BirdRepository birdrepository =  BirdRepository.getInstance();
		Scanner scanner = new Scanner(System.in);
		Bird bird = new Bird();
		System.out.println("Enter the name of bird");
		bird.name = scanner.nextLine();
		System.out.println("Enter the id of bird");
		bird.id = scanner.nextLine();
		System.out.println("Enter the color of bird");
		setColor(bird);
		birdrepository.add(bird);
		
//		Todo Bird Creation via user input
//		
//		Bird penguin = new Penguin("pn101");
//		Bird penguin1 = new Penguin("pn105");
//		Bird parrot = new Parrot("p102");
//		Bird duck = new Duck("d103");
//		Bird peacock = new Peacock("pe104");
//		
//		BirdRepository birdrepository =  BirdRepository.getInstance();
//		
//		birdrepository.add(duck);
//		birdrepository.add(penguin);
//		birdrepository.add(penguin1);
//		birdrepository.add(parrot);
//		birdrepository.add(peacock);
	}
	
	private void setColor(Bird bird) {
		int option = ShowColorMenu();

		Bird.Color[] colorVal = Bird.Color.values();
		bird.color = colorVal[option-1];
	}
	
	int ShowColorMenu() {
		System.out.println("Enter 1: for green");
		System.out.println("Enter 2: for black_white");
		System.out.println("Enter 3: for red");
		System.out.println("Enter 4: for white");
		int option = scanner.nextInt();
		return option;	
	}
	
	void handleusersection(int option) {
		BirdRepository birdrepository =  BirdRepository.getInstance();
		UserInterface ui =  UserInterface.getInstance();
		switch(option)
		{
		case 1:
			addBird();
			break;
		case 2:
			System.out.println("Enter bird Id you want to remove");
			String id = scanner.nextLine();
			Bird removeBird = birdrepository.getBird(id);
			birdrepository.remove(removeBird);
			break;
		case 3:
			System.out.println("Enter bird id you want to update");
			String id1 = scanner.nextLine();
			Bird updateBird = birdrepository.getBird(id1);
			int option1 = ui.showupdateMainMenu();
			handleupdateuserSelection(option1, updateBird);
			break;
		case 4:
			ui.print(birdrepository.getBirdList());
			break;
		case MAINEXIT:
			System.out.println("Tata Tata Bye Bye");
			break;
		default:
			System.out.println("choose proper option");
		}
	}
	
	private void handleupdateuserSelection(int option1, Bird updateBird ) {
		BirdRepository birdrepository =  BirdRepository.getInstance();
		switch(option1) {
		case 1:
			System.out.println("Enter new id");
			String newid = scanner.nextLine();
			updateBird.id = newid;
			System.out.println("bird id is edited");
			break;
		case 2:
			System.out.println("Enter new name");
			String newName = scanner.nextLine();
			updateBird.name = newName;
			System.out.println("bird name is edited");
			break;
		
		case 3:
			setColor(updateBird);
			break;
		}
	}
	
	public static void main(String[] args) {
		
		int option;
		UserInterface userinterface = UserInterface.getInstance();
		 Main main = new Main();
		 do {
	
			 option = userinterface.showMainMenu();
			 main.handleusersection(option);
		 }while(option != MAINEXIT);
		 
		
		
//		System.out.println("Welcome to bird Sanctuary");
//		Bird penguin = new Penguin("pn101");
//		Bird penguin1 = new Penguin("pn101");
//		Bird parrot = new Parrot("p102");
//		Bird duck = new Duck("d103");
//		Bird peacock = new Peacock("pe104");
//		
//		BirdRepository birdrepository = new BirdRepository();
//		
//		birdrepository.add(duck);
//		birdrepository.add(penguin);
//		birdrepository.add(penguin1);
//		birdrepository.add(parrot);
//		birdrepository.add(peacock);
//		
//		UserInterface ui = new UserInterface();
//		ui.print(birdrepository.getBirdList());
//		System.out.println("______________________________________________");
//		
//		birdrepository.remove(peacock);
//		System.out.println("remove 1 bird");
//		ui.print(birdrepository.getBirdList());
//		System.out.println("______________________________________________");
//		
//		System.out.println("Bird is Flyable");
//		ui.printflyable(birdrepository.getBirdList());
//		System.out.println("______________________________________________");
//		
//		System.out.println("Bird is Eatable");
//		ui.printeatable(birdrepository.getBirdList());
//		System.out.println("______________________________________________");
//		
//		System.out.println("Bird is swimable");
//		ui.printswimable(birdrepository.getBirdList());
	}
	
	
}