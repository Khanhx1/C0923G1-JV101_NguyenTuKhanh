package loop.bai_tap;

import java.util.Scanner;

public class Geometry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println();
        System.out.println("Enter number:");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw rectangle");
                System.out.println("Enter length of rectangle:");
                int lengthOfRectangle = scanner.nextInt();
                System.out.println("Enter width of rectangle:");
                int widthOfRectangle = scanner.nextInt();
                for (int i = 0; i < widthOfRectangle; i++) {
                    for (int j = 0; j < lengthOfRectangle; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.println("Draw square triangle");
                System.out.println("Enter height:");
                int heightOfSquareTriangle = scanner.nextInt();
                System.out.println("Bottom-left :");
                for (int i = 1; i <= heightOfSquareTriangle; i++) {
                    for (int j = 1; j <= heightOfSquareTriangle; j++) {
                        if (j <= i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("Bottom-right: ");
                for (int i = 1; i <= heightOfSquareTriangle; i++) {
                    for (int j = heightOfSquareTriangle; j >= 1; j--) {
                        if (j <= i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("Top-left:");
                for (int i = heightOfSquareTriangle; i >= 1; i--) {
                    for (int j = 1; j <= heightOfSquareTriangle; j++) {
                        if (j <= i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                System.out.println("Top-right:");
                for (int i = 1; i <= heightOfSquareTriangle; i++) {
                    for (int j = 1; j <= heightOfSquareTriangle; j++) {
                        if (j >= i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.println("Draw isosceles triangle ");
                System.out.println("Enter height of isosceles triangle:");
                int heightOfIsoscelesTriangle = scanner.nextInt();
                int baseOfIsoscelesTriangle = 3 + 2 * (heightOfIsoscelesTriangle - 2);
                int a = 0;
                System.out.println("isosceles triangle: ");
                for (int i = 1; i <= heightOfIsoscelesTriangle; i++) {
                    for (int j = 1; j <= baseOfIsoscelesTriangle; j++) {
                        if (j >= (baseOfIsoscelesTriangle - 1) / 2 + 1 - a && j <= (baseOfIsoscelesTriangle - 1) / 2 + 1 + a) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                    a++;
                }
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("No choice!");
        }
    }
}

