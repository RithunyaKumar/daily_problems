package day8;
import java.util.Scanner;

// Parent Class
class Bank {
    public void transaction() {
        System.out.println("Bank Transaction");
    }
}

// Child Class
class ATM extends Bank {

    double balance = 10000;

    // Method Overriding (Polymorphism)
    @Override
    public void transaction() {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Balance: Rs." + balance);
                    break;

                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    double deposit = sc.nextDouble();
                    balance = balance + deposit;
                    System.out.println("Amount Deposited Successfully.");
                    break;

                case 3:
                    System.out.print("Enter Withdraw Amount: ");
                    double withdraw = sc.nextDouble();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Please Collect Your Cash.");
                    } else {
                        System.out.println("Insufficient Balance.");
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}

// Main Class
public class Bank{
    public static void main(String[] args) {

        // Parent reference, Child object (Polymorphism)
        Bank obj = new ATM();

        obj.transaction();
    }
}