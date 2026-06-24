package day7;
import java.util.Scanner;
public class Student {
    String name;
    int accNo;
    double balance;

    Student(String name, int accNo, double balance) {
        this.name = name;
        this.accNo = accNo;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn");
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accNo);
        System.out.println("Balance: " + balance);
    }
}

