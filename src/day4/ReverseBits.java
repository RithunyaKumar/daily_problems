package day4;
import java.util.Scanner;

public class ReverseBits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = 0;

        for (int i = 0; i < 32; i++) {
            result = result << 1;
            result = result | (n & 1);
            n = n >> 1;
        }

        System.out.println("Reversed Bits Value = " + result);

        sc.close();
    }
}