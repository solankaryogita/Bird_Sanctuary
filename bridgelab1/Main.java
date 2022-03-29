package com.bridgelab1;

public class Main {
	static final int MAINEXIT = 5;
	
	void addBird() {
		// Todo Bird Creation via user input
		
		Bird penguin = new Penguin("pn101");
		Bird penguin1 = new Penguin("pn101");
		Bird parrot = new Parrot("p102");
		Bird duck = new Duck("d103");
		Bird peacock = new Peacock("pe104");
		
		BirdRepository birdrepository = new BirdRepository();
		
		birdrepository.add(duck);
		birdrepository.add(penguin);
		birdrepository.add(penguin1);
		birdrepository.add(parrot);
		birdrepository.add(peacock);
	}
	
	void handleusersection(int option) {
		switch(option)
		{
		case 1:
			addBird();
			break;
		case 2:
			System.out.println("Enter bird Id you want to remove");
			break;
		case 3:
			break;
		case 4:
			break;
		case MAINEXIT:
			System.out.println("Tata Tata Bye Bye");
			break;
		default:
			System.out.println("choose proper option");
		}
	}
	public static void main(String[] args) {
		
		int option;
		UserInterface userinterface = new UserInterface();
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