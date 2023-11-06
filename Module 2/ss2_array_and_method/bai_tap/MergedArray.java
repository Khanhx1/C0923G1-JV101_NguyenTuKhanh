package array_and_method.bai_tap;
import java.util.Scanner;
public class MergedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = new int[10];
        int[] arr2 = new int[5];
        int[] arr3 = new int[arr1.length + arr2.length];
        int indexOfArr2 = 0;
        System.out.println("Enter 10 elements of array 1");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }
        System.out.println("Enter 5 elements of array 2");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr3.length; i++) {
            arr3[i] = arr2[indexOfArr2];
            indexOfArr2++;
        }
        System.out.println("Elements in array3: ");
        for (int i : arr3) {
            System.out.print(i + ", ");
        }
    }
}
