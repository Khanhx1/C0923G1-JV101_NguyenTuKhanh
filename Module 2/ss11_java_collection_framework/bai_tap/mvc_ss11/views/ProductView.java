package mvc_ss11.views;


import mvc_ss11.controllers.ProductController;
import mvc_ss11.models.Product;

import java.util.List;
import java.util.Scanner;

public class ProductView {
    private Scanner scanner = new Scanner(System.in);
    private ProductController productController = new ProductController();
    public void menuProduct(){
        int choice;
       do{
           System.out.println("-----");
           System.out.println("Management functions: ");
           System.out.println("1. Add product");
           System.out.println("2. Remove product");
           System.out.println("3. Edit product");
           System.out.println("4. Display product");
           System.out.println("5. Find product");
           System.out.println("6. exit");
           System.out.println("-------------------");
           System.out.println("Enter your choose: ");
           System.out.println("-------------------");
          choice = Integer.parseInt(scanner.nextLine());
          switch (choice){
              case 1:
                  Product product = inputProduct();
                  productController.addProduct(product);
                  System.out.println("Add product successfully");
                  break;
              case 4:
                  List<Product> products = productController.getAll();
                  for (Product temp: products) {
                      System.out.println(temp);
                  }
                  break;
              case 2:
                  System.out.println("Enter id product you want to remove:");
                  String inputId = scanner.nextLine();
                  Product removeProduct = productController.findById(inputId);
                  if (removeProduct != null) {
                      System.out.println("Information of removed product: " + removeProduct);
                      System.out.println("Do you want to remove it? y for confirm: ");
                      String confirm = scanner.nextLine();
                      if (confirm.equals("y")) {
                          productController.removeProduct(inputId);
                      } else {
                          System.out.println("Your removal operation is cancled");
                      }
                  }else {
                      System.out.println("Product is not found");
                  }
                  break;
              case 3:
                  System.out.println("Enter id product you want to edit: ");
                  String idProductEdit = scanner.nextLine();
                  Product editProduct = productController.findById(idProductEdit);
                  if(editProduct != null) {
                      System.out.println("Information of edited product: " + editProduct);
                      System.out.println("Enter new value for product: ");
                      Product newEditedProduct = inputProduct();
                      System.out.println("Save changes? (y for yes)");
                      String confirm = scanner.nextLine();
                      if(confirm.equals("y")){
                          productController.removeProduct(idProductEdit);
                          productController.addProduct(newEditedProduct);
                      } else {
                          System.out.println("Your changes is not saved");
                      }
                  } else {
                      System.out.println("Id is not found!");
                  }
                  break;
          }
       } while (choice != 6);

    }
    public Product inputProduct(){
        System.out.println("Enter id's product:");
        String id = scanner.nextLine();
        System.out.println("Enter name's product:");
        String name = scanner.nextLine();
        System.out.println("Enter price's product:");
        Long price = Long.valueOf(scanner.nextLine());
        return new Product(id, name, price);
    }
}
