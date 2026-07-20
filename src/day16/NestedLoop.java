package day16;
public class NestedLoop {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
    }
}