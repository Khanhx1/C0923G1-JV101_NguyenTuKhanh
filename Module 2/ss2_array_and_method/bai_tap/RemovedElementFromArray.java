package array_and_method.bai_tap;

import java.util.Scanner;

public class RemovedElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Enter element you want to remove");
        int number = scanner.nextInt();
        int index = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                index = i;
                count++;
                break;
            }
        }
        System.out.println("Result: ");
        if (count != 0) {
            for (int i = index; i < array.length - 1; i++) {
                array[i] = array[i + 1];
            }
            array[array.length - 1] = 0;
            for (int i : array) {
                System.out.print(i + ", ");
            }
        } else {
            System.out.println("Selected element is not in array!");
        }
    }
}
