package array_and_method.bai_tap;

import java.util.Scanner;

public class MinElementInArray {
    public static int findMinElement(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int lengthOfArray = scanner.nextInt();
        int[] array = new int[lengthOfArray];
        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println("Enter element " + i);
            array[i] = scanner.nextInt();
        }
        System.out.println("Min element in array:");
        System.out.println(findMinElement(array));
    }
}
