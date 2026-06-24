package dailyproblems;
import java.util.Scanner;
public class division {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first integer: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second integer: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;

            System.out.println("Integer Division = " + result);

            sc.close();
        }

}
