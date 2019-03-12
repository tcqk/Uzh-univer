package bbc;

import java.util.Scanner;

public class viktoryna {

	public static void main(String[] args) {
		System.out.println("Hi, I am a program to test your knowledge in computer technology.");
		System.out.println("==========");
		System.out.println("What company is the most advanced in the production of laptops?");
		System.out.println("1. Lenovo");
		System.out.println("2. Mac");
		System.out.println("3. Dell");
		
		Scanner hogsco = new Scanner (System.in);
		
		int rahunok=0; 
		boolean running=true;
		while(running) {
			String Laptop= hogsco.nextLine();	
			
		switch (Integer.parseInt(Laptop)) {
		case 1:
			System.out.println("No, Lenovo 3 in the rating.");
			break;
		case 2:
			System.out.println("Yeah that's right is Mac.");
			running=false;
			break;
		case 3:
			System.out.println("No, Dell 2 in the rating.");
			break;
		
		default:
			System.out.println("Chose from list! You dont have brain.");
		
		
		
		
		}
		
		}
			System.out.println("==========");
			System.out.println("Good job. Play on?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			
			Scanner fifi = new Scanner (System.in);
			int yesorno= 0;
			boolean running1=true;
			while(running1) {
				String question= fifi.nextLine();
			switch (Integer.parseInt(question))	{
			
			case 1:
				System.out.println("Ok, let's go.");
				running1 = false;
				break;
			case 2:	
				System.out.println("Okay bye. You quickly gave up...");
				running1 = false;
				break;
			
			default:
				System.out.println("Choose from the list");
			}
			}
			
			System.out.println("");
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
