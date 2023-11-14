package ss7_abstract_class_interface.bai_tap.interface_resizable;

import javax.annotation.processing.Generated;
import java.util.Arrays;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        System.out.println("Random number from 1 to 100:");
        System.out.println(randomNumber);
        Shape[] arr = new Shape[3];
        arr[0] = new Circle(1);
        arr[1] = new Rectangle(2, 4);
        arr[2] = new Square(5);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof Circle) {
                Circle circle = (Circle) arr[i];
                circle.resize(randomNumber);
            }
            if (arr[i].getClass() == Rectangle.class) {
                Rectangle rectangle = (Rectangle) arr[i];
                rectangle.resize(randomNumber);
            }
            if (arr[i].getClass() == Square.class) {
                Square square = (Square) arr[i];
                square.resize(randomNumber);
            }
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);


    }
}
