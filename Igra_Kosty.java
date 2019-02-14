import java.util.Random;
import java.util.Scanner;

public class Igra_Kosty {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Player 1, type 'Enter'");
		String g = in.nextLine();
		Random r1 = new Random();
		int p1 = r1.nextInt(6) + 1;
		System.out.println("Player 1 has " + p1 + " points.");
		System.out.print("Player 2, type 'Enter'");
		Scanner on = new Scanner(System.in);
		g = on.nextLine();
		Random r2 = new Random();
		int p2 = r2.nextInt(6) + 1;
		System.out.println("Player 2 has " + p2 + " points.");
		if (p1 > p2) {
			System.out.println("Player 1 wins!");
		} else {
			if (p2 > p1) {
				System.out.println("Player 2 wins!");
			} else {
				System.out.println("Nobody wins :)");
			}};

	}

}
