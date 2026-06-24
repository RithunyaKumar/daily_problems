package day2;
import java.util.Scanner;

public class PassThePillow {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of people: ");
        int n = sc.nextInt();

        System.out.print("Enter time: ");
        int time = sc.nextInt();

        int person = 1;
        boolean forward = true;

        while (time > 0) {

            if (forward) {
                person++;

                if (person == n) {
                    forward = false;
                }

            } else {

                person--;

                if (person == 1) {
                    forward = true;
                }
            }

            time--;
        }

        System.out.println("Pillow is with person " + person);

        sc.close();
    }
}