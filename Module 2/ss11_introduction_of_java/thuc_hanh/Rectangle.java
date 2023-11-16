package introduction_of_java.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);//Khai báo đối tượng Scanner

        System.out.println("Enter width: ");
        width = scanner.nextFloat();//Nhập chiều rộng

        System.out.println("Enter height: ");
        height = scanner.nextFloat();//Nhập chiều cao
        float area = width * height;

        System.out.println("Area is: " + area);
    }

}
