package OOP.thuc_hanh;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Draw rhombus ");
        System.out.println("Enter size of edge:");
        int inputSizeOfEdge = scanner.nextInt();
        int heightOfTriangle = inputSizeOfEdge + 1;
        int baseOfTriangle = 3 + 2 * (heightOfTriangle - 2);
        int a = 0;  // biến đơn vị tam giác phía trên, thay đổi phạm vi cho mỗi lần lặp.
        int b = 0;  // biến đơn vị tam giác phía dưới
        int number = 0;
        System.out.println("Rhombus: ");
        for (int i = 1; i <= heightOfTriangle; i++) {
            for (int j = 1; j <= baseOfTriangle; j++) {
                if (i == 1) {
                    System.out.print(" ");
                    continue;
                }
                if (j == (baseOfTriangle - 1) / 2 + 1 - a || j == (baseOfTriangle - 1) / 2 + 1 + a) {
                    System.out.print(number);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            a++;
            number++;
        }
        for (int i = 1; i <= heightOfTriangle - 2; i++) {
            for (int j = 1; j <= baseOfTriangle; j++) {
                if (j == baseOfTriangle - 1 - b || j == (2 + b)) {
                    System.out.print(number - 2);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            b++;
            number--;
        }
    }
}
