package Array;

import java.util.Stack;

/**
 * Created by imransay on 10/17/2015.
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression. For example:
 * <p>
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 */
public class Evaluate_Reverse_Polish_Notation {
    public static Stack<Integer> stack;

    public static void main(String[] args) {
        String[] arr = new String[]{"4", "13", "5", "/", "+"};
        stack = new Stack<Integer>();

        for (String str : arr) {
            switch (str) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a-b);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    b = stack.pop();
                    a = stack.pop();
                    stack.push(a / b);
                    break;
                default:
                    stack.push(Integer.parseInt(str));
                    break;
            }
        }

        System.out.println(stack.pop());


    }

}
