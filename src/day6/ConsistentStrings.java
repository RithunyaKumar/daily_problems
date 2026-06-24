package day6;
import java.util.Scanner;

public class ConsistentStrings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter allowed string: ");
        String allowed = sc.next();

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();

        int count = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Enter word: ");
            String word = sc.next();

            boolean ok = true;

            for (int j = 0; j < word.length(); j++) {

                if (allowed.indexOf(word.charAt(j)) == -1) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                count++;
            }
        }

        System.out.println("Consistent Strings = " + count);

        sc.close();
    }
}