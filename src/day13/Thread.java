package day13;
class MyThread extends Thread {

    synchronized void printMessage() {
        System.out.println("Hello Java");
    }

    public void run() {
        printMessage();
    }
}

public class Thread {

    public static void main(String[] args) {

        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();
    }
}