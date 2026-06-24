package day4;
import java.util.Scanner;

public class PrimeSetBits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter left: ");
        int left = sc.nextInt();

        System.out.print("Enter right: ");
        int right = sc.nextInt();

        int count = 0;

        for (int i = left; i <= right; i++) {

            int num = i;
            int bits = 0;

            while (num > 0) {
                bits = bits + (num % 2);
                num = num / 2;
            }

            if (bits == 2 || bits == 3 || bits == 5 || bits == 7 ||
                    bits == 11 || bits == 13 || bits == 17 || bits == 19) {
                count++;
            }
        }

        System.out.println("Answer = " + count);

        sc.close();
    }
}