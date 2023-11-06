package array_and_method.bai_tap;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 5, 6};
        int count = 0;
        System.out.println("Enter element that need to be added");
        int number = scanner.nextInt();
        System.out.println("Enter index of added element in array");
        int index = scanner.nextInt();
        if (index >= 0 && index < array.length) {
            int[] newArray = new int[array.length + 1];
            System.out.println("result");
            for (int i = 0; i < newArray.length; i++) {
                if (i == index) {
                    newArray[i] = number;
                    count++;
                    continue;
                }
                if (count == 0) {
                    newArray[i] = array[i];
                } else {
                    newArray[i] = array[i - 1];
                }
            }
            for (int i : newArray) {
                System.out.print(i + ", ");
            }
        } else {
            System.out.println("invalid index!");
        }
    }
}
