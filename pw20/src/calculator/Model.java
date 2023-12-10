package calculator;

import java.util.Stack;

public class Model {
    public double calculate(String expression) {
        Stack<Double> stack = new Stack<>();

        String[] tokens = expression.split(" ");
        for (String token : tokens) {
            if (token.matches("-?\\d+(\\.\\d+)?")) {
                stack.push(Double.parseDouble(token));
            } else if (token.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (token.equals("-")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                stack.push(operand1 - operand2);
            } else if (token.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if (token.equals("/")) {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                stack.push(operand1 / operand2);
            }
        }

        return stack.pop();
    }
}
