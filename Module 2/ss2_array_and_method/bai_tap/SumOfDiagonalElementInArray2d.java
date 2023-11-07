package array_and_method.bai_tap;

import java.util.Scanner;

public class SumOfDiagonalElementInArray2d {
    public static double getSumOfDiagonalElement(double[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of square matrix");
        int sizeOfArray = scanner.nextInt();
        double[][] matrix = new double[sizeOfArray][sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            for (int j = 0; j < sizeOfArray; j++) {
                System.out.println("Enter element row " + i + " colum " + j);
                matrix[i][j] = scanner.nextDouble();
            }
        }
        System.out.println("Sum of diagonal line of element:");
        System.out.println(getSumOfDiagonalElement(matrix));
    }
}
