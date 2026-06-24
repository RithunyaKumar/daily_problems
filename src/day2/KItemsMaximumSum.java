package day2;
import java.util.Scanner;
public class KItemsMaximumSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numOnes: ");
        int ones = sc.nextInt();

        System.out.print("Enter numZeros: ");
        int zeros = sc.nextInt();

        System.out.print("Enter numNegOnes: ");
        int negOnes = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int sum = 0;

        while (k > 0 && ones > 0) {
            sum++;
            ones--;
            k--;
        }

        while (k > 0 && zeros > 0) {
            zeros--;
            k--;
        }

        while (k > 0 && negOnes > 0) {
            sum--;
            negOnes--;
            k--;
        }

        System.out.println("Maximum Sum = " + sum);

        sc.close();
    }
}