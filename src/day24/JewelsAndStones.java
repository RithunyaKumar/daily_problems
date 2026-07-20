package day24;
public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {

        int count = 0;

        for (int i = 0; i < stones.length(); i++) {

            if (jewels.indexOf(stones.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Main obj = new Main();

        System.out.println(obj.numJewelsInStones("aA", "aAAbbbb"));
    }
}