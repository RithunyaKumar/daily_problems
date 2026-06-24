package day5;
import java.util.Scanner;

public class DistributeCandies {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter candies: ");
        int candies = sc.nextInt();

        System.out.print("Enter number of people: ");
        int people = sc.nextInt();

        int[] result = new int[people];

        int give = 1;
        int index = 0;

        while (candies > 0) {

            if (candies >= give) {
                result[index] = result[index] + give;
                candies = candies - give;
            } else {
                result[index] = result[index] + candies;
                candies = 0;
            }

            give++;
            index++;

            if (index == people) {
                index = 0;
            }
        }

        System.out.println("Candies Distribution:");

        for (int i = 0; i < people; i++) {
            System.out.println("Person " + (i + 1) + " = " + result[i]);
        }

        sc.close();
    }
}