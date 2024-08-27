import java.io.*;
import java.util.*;

public class infix {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // Stacks for postfix, prefix, and operators
        Stack<String> postfix = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == '(') {
                ops.push(ch);
            } else if (ch >= '0' && ch <= '9' || ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
                postfix.push(ch + "");
                prefix.push(ch + "");
            } else if (ch == ')') {
                while (ops.peek() != '(') {
                    char op = ops.pop();

                    // Postfix
                    String postv2 = postfix.pop();
                    String postv1 = postfix.pop();
                    String postv = postv1 + postv2 + op;
                    postfix.push(postv);

                    // Prefix
                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();
                    String prev = op + prev1 + prev2;
                    prefix.push(prev);
                }
                ops.pop(); // pop '(' from the stack
            } else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(ch)) {
                    char op = ops.pop();

                    // Postfix
                    String postv2 = postfix.pop();
                    String postv1 = postfix.pop();
                    String postv = postv1 + postv2 + op;
                    postfix.push(postv);

                    // Prefix
                    String prev2 = prefix.pop();
                    String prev1 = prefix.pop();
                    String prev = op + prev1 + prev2;
                    prefix.push(prev);
                }
                ops.push(ch);
            }
        }

        // Pop all the remaining operators from the stack
        while (!ops.isEmpty()) {
            char op = ops.pop();

            // Postfix
            String postv2 = postfix.pop();
            String postv1 = postfix.pop();
            String postv = postv1 + postv2 + op;
            postfix.push(postv);

            // Prefix
            String prev2 = prefix.pop();
            String prev1 = prefix.pop();
            String prev = op + prev1 + prev2;
            prefix.push(prev);
        }

        // Output the final postfix and prefix expressions
        System.out.println("Postfix: " + postfix.peek());
        System.out.println("Prefix: " + prefix.peek());
    }

    // Method to get precedence of operators
    static int precedence(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}
