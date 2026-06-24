package day6;
import java.util.Scanner;

public class FindDifference {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.next();

        System.out.print("Enter second string: ");
        String t = sc.next();

        char result = ' ';

        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (s.indexOf(ch) == -1) {
                result = ch;
            }
        }

        System.out.println("Extra Character = " + result);

        sc.close();
    }
}