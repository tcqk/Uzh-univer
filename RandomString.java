package random_string;

import java.util.Random;

public class RandomString {
	String[] word1 = {"Z kym", "De", "Skilky"};
	String[] word2 = {"buv vin", "bula vona", "bulo vono"};
	String[] word3 = {"vchora", "pozavchora", "u ponedilok"};
	Random r = new Random();
	int i= word2.length;
	void vah(){
		System.out.print(word1[r.nextInt(word1.length)] + " ");
		System.out.print(word2[r.nextInt(word2.length)] + " ");
		System.out.println(word3[r.nextInt(word3.length)] + "?");
	}
}