package ss10_DSA_stack_queue.bai_tap;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.lang.String;

public class Palindrome {
    public static void main(String[] args) {
        String string = "Able was I ere I saw Elba";
        String upperCaseString = string.toUpperCase();
        String[] arrayOfString;
        arrayOfString = upperCaseString.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < arrayOfString.length; i++) {
            stack.push(arrayOfString[i]);
            queue.add(arrayOfString[i]);
        }
        int count = 0;
        String charQueue;
        while (!stack.isEmpty()) {
            charQueue = queue.remove();
            if (!charQueue.equals(stack.pop())) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("this string is a palindrone");
        } else {
            System.out.println("this string is not a palindrone");
        }
    }
}
