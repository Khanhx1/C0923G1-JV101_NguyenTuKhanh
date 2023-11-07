package array_and_method.bai_tap;

import java.util.Scanner;

public class MaxElementInArray2d {
    public static double findMaxElement(double[][] array2d) {
        double max = array2d[0][0];
        for (int i = 0; i < array2d.length; i++) {
            for (int j = 1; j < array2d[i].length; j++) {
                if (max < array2d[i][j]) {
                    max = array2d[i][j];
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows of array2d:");
        int row = scanner.nextInt();
        System.out.println("Enter number of colums of array2d:");
        int colum = scanner.nextInt();
        double[][] array2d = new double[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("Enter element has row " + i + " colum " + j);
                array2d[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Max element in array:");
        System.out.println(findMaxElement(array2d));
    }
}
