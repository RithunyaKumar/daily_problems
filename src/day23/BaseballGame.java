package day23;
import java.util.Stack;

public class BaseballGame {

    public int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();

        for (String op : operations) {

            if (op.equals("+")) {
                int a = stack.pop();
                int b = stack.peek();
                stack.push(a);
                stack.push(a + b);
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(op));
            }
        }

        int sum = 0;

        for (int score : stack) {
            sum += score;
        }

        return sum;
    }

    public static void main(String[] args) {

        Main obj = new Main();

        String[] ops = {"5","2","C","D","+"};

        System.out.println(obj.calPoints(ops));
    }
}