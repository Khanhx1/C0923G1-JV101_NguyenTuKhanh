package ss10_DSA_stack_queue.bai_tap;

import java.util.Stack;
import java.util.Scanner;

public class ConvertDecimalToBinarySystem {
    public static void main(String[] args) {
        String binary = "";
        System.out.println("Enter decimal number:");
        Scanner scanner = new Scanner(System.in);
        int divident = scanner.nextInt();
        int quotient;
        int remainder;
        final int DIVISOR = 2;
        Stack<Integer> stack = new Stack<>();
        if (divident == 0) {
            binary = "0";
        }
        while (divident != 0) {
            quotient = divident / DIVISOR;
            remainder = divident % DIVISOR;
            stack.push(remainder);
            divident = quotient;
        }
        while (!stack.isEmpty()) {
            binary += stack.pop();
        }
        System.out.println(binary);
    }
}
