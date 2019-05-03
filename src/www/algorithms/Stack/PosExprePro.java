package www.algorithms.Stack;


import java.util.Scanner;
import java.util.Stack;

public class PosExprePro {
    public static void main(String[] args) {
        Stack<Character> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        char[] pos = s.toCharArray();
        int i = -1;
        while (++i < pos.length) {

            if (pos[i] == '(') {
            } else if (pos[i] == '+') {
                ops.push(pos[i]);
            } else if (pos[i] == '-') {
                ops.push(pos[i]);
            } else if (pos[i] == '*') {
                ops.push(pos[i]);
            } else if (pos[i] == '/') {
                ops.push(pos[i]);
            }  else if (pos[i]== ')') {
                char op = ops.pop();
                double v = vals.pop();
                if (op == '+') {
                    v = vals.pop() + v;
                } else if (op == '-') {
                    v = vals.pop() - v;
                } else if (op == '*') {
                    v = vals.pop() * v;
                } else if (op == '/') {
                    v = vals.pop() / v;
                }
                vals.push(v);
            } else {
                vals.push(Double.parseDouble(String.valueOf(pos[i])));
            }
        }
        System.out.println(vals.pop());
    }

}
