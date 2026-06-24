package day2;
import java.util.Scanner;

public class BulbSwitcher {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bulbs: ");
        int n = sc.nextInt();

        int result = (int)Math.sqrt(n);

        System.out.println("Bulbs ON = " + result);

        sc.close();
    }
}