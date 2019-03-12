import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		String name = in("Hello, what is your name?");
		int age = Integer.parseInt(in("How old are you?"));
		byte tries = 1;
		int point = 0;
		String a1;
		boolean check = true;
		String[][] q = new String[4][6];
		if (age < 6) {
			System.out.println("Sorry, but you are too young to play this quiz(");
			return;
		}
		
		if (age >= 6 && age <= 10) {
			q[0][0] = "How many oceans are there on the Earth?";
			q[0][1] = "3";
			q[0][2] = "4";
			q[0][3] = "5";
			q[0][4] = "6";
			q[0][5] = "B";
			
			q[1][0] = "How many surfaces has a cube?";
			q[1][1] = "3";
			q[1][2] = "4";
			q[1][3] = "5";
			q[1][4] = "6";
			q[1][5] = "D";
			
			q[2][0] = "What letter goes next to 'F'?";
			q[2][1] = "T";
			q[2][2] = "E";
			q[2][3] = "G";
			q[2][4] = "H";
			q[2][5] = "C";
			
			q[3][0] = "What is the first month of the summer?";
			q[3][1] = "June     ";
			q[3][2] = "September";
			q[3][3] = "December ";
			q[3][4] = "March    ";
			q[3][5] = "A";	
		}
		
		if (age >= 11 && age <= 14) {
			q[0][0] = "What character matches Oxygen in chemistry? ";
			q[0][1] = "X";
			q[0][2] = "O";
			q[0][3] = "P";
			q[0][4] = "N";
			q[0][5] = "B";
			
			q[1][0] = "What planet is the third from the Sun?";
			q[1][1] = "Mars   ";
			q[1][2] = "Mercury";
			q[1][3] = "Earth  ";
			q[1][4] = "Venera ";
			q[1][5] = "C";
			
			q[2][0] = "If we have 2 chickens and 1 sheep, how pany paws do we have?";
			q[2][1] = "6 ";
			q[2][2] = "12";
			q[2][3] = "10";
			q[2][4] = "8 ";
			q[2][5] = "D";
			
			q[3][0] = "How many seconds has an hour?";
			q[3][1] = "3600";
			q[3][2] = "60  ";
			q[3][3] = "120 ";
			q[3][4] = "1800";
			q[3][5] = "A";	
		}
		
		if (age >= 15 && age <= 17) {
			q[0][0] = "What character matches Strength in physics?";
			q[0][1] = "I";
			q[0][2] = "U";
			q[0][3] = "R";
			q[0][4] = "F";
			q[0][5] = "D";
			
			q[1][0] = "What is the population of the Earth?";
			q[1][1] = "About 7 billions ";
			q[1][2] = "About 10 billions";
			q[1][3] = "About 5 billions ";
			q[1][4] = "About 3 billions ";
			q[1][5] = "A";
			
			q[2][0] = "When did the World War II start?";
			q[2][1] = "1941";
			q[2][2] = "1939";
			q[2][3] = "1945";
			q[2][4] = "1937";
			q[2][5] = "B";
			
			q[3][0] = "How much oxygen is in the air?";
			q[3][1] = "About 78%";
			q[3][2] = "About 50%";
			q[3][3] = "About 21%";
			q[3][4] = "About 44%";
			q[3][5] = "C";	
		}
		
		if (age >= 18) {
			q[0][0] = "What country has the highest population?";
			q[0][1] = "India ";
			q[0][2] = "USA   ";
			q[0][3] = "Brazil";
			q[0][4] = "China ";
			q[0][5] = "D";
			
			q[1][0] = "Who wrote 'War and Peace'?";
			q[1][1] = "Leo Tolstoy      ";
			q[1][2] = "Oleksandr Pushkin";
			q[1][3] = "Fyodor Dostoevsky";
			q[1][4] = "Mikhail Bulgakov ";
			q[1][5] = "A";
			
			q[2][0] = "What is the height of the highest mountain in the world (Kilimanjaro)?";
			q[2][1] = "5216 m";
			q[2][2] = "6530 m";
			q[2][3] = "5895 m";
			q[2][4] = "7345 m";
			q[2][5] = "C";
			
			q[3][0] = "What ocean is the warmest?";
			q[3][1] = "Atlantic";
			q[3][2] = "Indian  ";
			q[3][3] = "Arctic  ";
			q[3][4] = "Pacific ";
			q[3][5] = "B";	
		}
		
		
			System.out.println("Okey, " + name + ". Let's start our quiz! (Please type only a letter)");
			for (int i = 0; i <= 3; i++) {
			tries = 1;
			check = true;
			while(tries < 3 && check) {
			a1 = in((i + 1) + ". " + q[i][0] + "\r\nA:" + q[i][1] + " C:" + q[i][3] + "\r\nB:" + q[i][2] + " D:" + q[i][4]);
			if (a1.equals(q[i][5]) || a1.equals(q[i][5].toLowerCase())) {
				if (i != 3) {
				System.out.println("Yea, you are right! Let's see next question");
				} else {
					System.out.println("Yea, you are right! It was the last question.");
				}
				point++;
				check = false;
			} else {
				if (tries == 1) {
				System.out.println("It seems like your answer isn't correct. Try again");
				tries++;
				} else { 
					if (i != 3) {
					System.out.println("Sorry, but you made a mistake again. Let's see next question");
					} else {
						System.out.println("Sorry, but you made a mistake again. It was the last question.");
					}
					check = false;
				}
			}
			}
			}
			System.out.println("Your points: " + point + ". See you)");		
	}
	
	static String in(String a) {
		System.out.println(a);
		Scanner in = new Scanner(System.in);
		return in.nextLine();
	}

}
