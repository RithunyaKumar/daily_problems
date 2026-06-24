package day3;
import java.util.Scanner;

public class TrailingZeroes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int count = 0;

        while (n > 0) {
            n = n / 5;
            count = count + n;
        }

        System.out.println("Trailing Zeroes = " + count);

        sc.close();
    }
}