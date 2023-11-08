package array_and_method.bai_tap;

import java.util.Scanner;

public class SumOfColumnInArray {
    public static double getSumOfColumn(double[][] array2d, int column) {
        double sum = 0;
        for (int i = 0; i < array2d.length; i++) {
            sum += array2d[i][column];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter row of array2d");
        int row = scanner.nextInt();
        System.out.println("Enter column of array2d");
        int column = scanner.nextInt();
        double[][] array2d = new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter element row " + i + " column " + j);
                array2d[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Enter column you choose");
        int selectedColumn = scanner.nextInt();
        System.out.println("Sum of column " + selectedColumn + ":");
        System.out.println(getSumOfColumn(array2d, selectedColumn));
    }
}
