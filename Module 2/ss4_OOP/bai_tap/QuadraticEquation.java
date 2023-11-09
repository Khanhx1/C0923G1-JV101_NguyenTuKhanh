package OOP.bai_tap;

import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return (-1 * b + Math.pow(this.getDiscriminant(), 0.5)) / 2 * a;
    }

    public double getRoot2() {
        return (-1 * b - Math.pow(this.getDiscriminant(), 0.5)) / 2 * a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        if (equation.getDiscriminant() > 0) {
            System.out.println("Quadratic equation has two roots:");
            System.out.println("r1: " + equation.getRoot1());
            System.out.println("r2: " + equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.println("Quadratic equation has one root:");
            System.out.println("r: " + equation.getRoot1());
        } else {
            System.out.println("Quadratic equation has no roots");
        }
    }
}
