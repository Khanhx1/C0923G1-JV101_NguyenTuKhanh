package ss10_DSA_stack_queue.bai_tap;

import java.util.Stack;

public class ReservedElementInStack {
    public static void main(String[] args) {
        String reservedIntegerStack = " ";
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }

        for (int i = 0; i < array.length; i++) {
            reservedIntegerStack += array[i] + ", ";
        }
        System.out.println(reservedIntegerStack);

        Stack<String> wStack = new Stack<>();
        String string = "mot hai ba bon nam";
        String[] mWord;
        String newString = "";
        mWord = string.split(" ");
        for (int i = 0; i < mWord.length; i++) {
            wStack.push(mWord[i]);
        }
        for (int i = 0; i < mWord.length; i++) {
            mWord[i] = wStack.pop();
        }
        for (int i = 0; i < mWord.length; i++) {
            newString += mWord[i] + " ";
        }
        System.out.println(newString);
    }
}
