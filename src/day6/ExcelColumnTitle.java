package day6;
import java.util.Scanner;

public class ExcelColumnTitle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter column number: ");
        int column = sc.nextInt();

        String result = "";

        while (column > 0) {

            column--;

            char ch = (char)('A' + (column % 26));

            result = ch + result;

            column = column / 26;
        }

        System.out.println("Column Title = " + result);

        sc.close();
    }
}