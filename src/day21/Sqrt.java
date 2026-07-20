package day21;
public class Sqrt {

    public int mySqrt(int x) {

        int i = 0;

        while ((long) i * i <= x) {
            i++;
        }

        return i - 1;
    }

    public static void main(String[] args) {

        Main obj = new Main();

        System.out.println(obj.mySqrt(8));
    }
}