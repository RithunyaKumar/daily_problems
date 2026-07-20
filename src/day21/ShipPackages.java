package day21;
public class ShipPackages {

    public int shipWithinDays(int[] weights, int days) {

        int capacity = 0;

        for (int weight : weights) {
            capacity += weight;
        }

        return capacity / days + 1;
    }

    public static void main(String[] args) {

        Main obj = new Main();

        int[] weights = {1, 2, 3, 4, 5};

        System.out.println(obj.shipWithinDays(weights, 5));
    }
}