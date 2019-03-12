package bbc;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        String[][] Quess = new String[][]{{"2+2 ", "3+3 ", "4+4 ", "4+5 "}, {"2*2 ", "(3*3)/9 ", "2*2+1 ", "21/3 "}, {"31", "32", "33", "34"}, {"41", "42", "43", "44"}};
        String[][][] VariantAnswer = new String[][][]{{{"a) 7", "b) 1", "c) 3", "d) 4"}, {"a) 2", "b) 4", "c) 6", "d) 8"}, {"a) 5", "b) 6", "c) 7", "d) 8"}, {"a) 7", "b) 8", "c) 9", "d) 10"}}, {{"a) 1", "b) 2", "c) 3", "d) 4"}, {"a) 1", "b) 2", "c) 3", "d) 4"}, {"a) 1", "b) 2", "c) 3", "d) 4"}, {"a) 1", "b) 2", "c) 3", "d) 4"}}, {{"a) 1", "b) 2", "c) 3", "d) 4"}, {"a) 1", "b) 2", "c) 3", "d) 4"}, {"a) 1", "b) 2", "c) 3", "d) 4"}, {"a) 1", "b) 2", "c) 3", "d) 4"}}, {{"a) 1", "b) 2", "c) 3", "d) 4"}, {"a) 1", "b) 2", "c) 3", "d) 4"}, {"a) 1", "b) 2", "c) 3", "d) 4"}, {"a) 1", "b) 2", "c) 3", "d) 4"}}};
        char[][] Answer = new char[][]{{'d', 'c', 'd', 'c'}, {'d', 'b', 'c', 'a'}, {' ', ' ', ' ', ' '}, {' ', ' ', ' ', ' '}};
        int points = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.next();
        System.out.println("Hello " + name);
        System.out.println("How old are you?");
        int buf = scan.nextInt();
        byte level = 0;
        if (buf <= 10) {
            level = 0;
        } else if (buf > 10 && buf <= 14) {
            level = 1;
        } else if (buf > 14 && buf <= 18) {
            level = 2;
        } else if (buf > 18 && buf <= 40) {
            level = 3;
        }

        for(int i = 0; i < 4; ++i) {
            for(int j = 0; j < 2; ++j) {
                System.out.println(Quess[level][i]);

                for(int k = 0; k < 4; ++k) {
                    System.out.println(VariantAnswer[level][i][k]);
                }

                char Answ = scan.next().charAt(0);
                if (Answ == Answer[level][i]) {
                    ++points;
                    break;
                }

                System.out.println("Incorect answer, you have one more chance");
            }
        }

        System.out.println("You have " + points + " points");
        System.out.println("Goodbye " + name);
    }
}

