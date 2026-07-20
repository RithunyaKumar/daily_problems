package day9;
abstract class ATM {
    abstract void transaction();
}

class Deposit extends ATM {
    void transaction() {
        System.out.println("Amount Deposited");
    }
}

public class Main {
    public static void main(String[] args) {
        ATM a = new Deposit();
        a.transaction();
    }
}