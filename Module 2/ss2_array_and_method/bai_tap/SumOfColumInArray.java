package array_and_method.bai_tap;

import java.util.Scanner;

public class SumOfColumInArray {
    public static double getSumOfColum(double[][] array2d, int colum) {
        double sum = 0;
        for (int i = 0; i < array2d.length; i++) {
            sum += array2d[i][colum];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row of array2d");
        int row = scanner.nextInt();
        System.out.println("Enter colum of array2d");
        int colum = scanner.nextInt();
        double[][] array2d = new double[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("Enter element row " + i + " colum " + j);
                array2d[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Enter colum you choose");
        int selectedColum = scanner.nextInt();
        System.out.println("Sum of colum " + selectedColum + ":");
        System.out.println(getSumOfColum(array2d, selectedColum));
    }
}
