package day3;
import java.util.Scanner;

public class WaterBottles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bottles: ");
        int numBottles = sc.nextInt();

        System.out.print("Enter exchange rate: ");
        int numExchange = sc.nextInt();

        int total = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {

            int newBottles = empty / numExchange;
            total = total + newBottles;

            empty = (empty % numExchange) + newBottles;
        }

        System.out.println("Total bottles drunk = " + total);

        sc.close();
    }
}