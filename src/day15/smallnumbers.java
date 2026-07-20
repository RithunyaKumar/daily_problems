package day15;
public class smallnumbers {

    public int smallnumber(int n) {

        int num = 1;

        while (num < n) {
            num = (num << 1) | 1;
        }

        return num;
    }

    public static void main(String[] args) {

        SmallestNumber obj = new SmallestNumber();

        System.out.println(obj.smallestNumber(10));
    }
}