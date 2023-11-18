package mvc_ss11.views;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductView productView = new ProductView();
        int choice;
       do {
           System.out.println("-----");
           System.out.println("1. manage product");
           System.out.println("2. Exit");
           System.out.println("-------------------");
           System.out.println("Enter your choose: ");
           System.out.println("-------------------");
           choice = Integer.parseInt(scanner.nextLine());
           switch (choice) {
               case 1:
                   productView.menuProduct();
                   break;
               case 2:
                   System.exit(0);
           }
       } while (choice!= 2);
    }
}
