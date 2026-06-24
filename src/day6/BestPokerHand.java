package day6;
import java.util.Scanner;

public class BestPokerHand {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] ranks = new int[5];
        char[] suits = new char[5];

        System.out.println("Enter 5 ranks:");

        for (int i = 0; i < 5; i++) {
            ranks[i] = sc.nextInt();
        }

        System.out.println("Enter 5 suits (a,b,c,d):");

        for (int i = 0; i < 5; i++) {
            suits[i] = sc.next().charAt(0);
        }

        boolean flush = true;

        for (int i = 1; i < 5; i++) {
            if (suits[i] != suits[0]) {
                flush = false;
            }
        }

        if (flush) {
            System.out.println("Best Hand = Flush");
        } else {
            System.out.println("Best Hand = High Card");
        }

        sc.close();
    }
}