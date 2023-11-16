package introduction_of_java.bai_tap;

import java.util.Scanner;

public class ConvertCurrancy {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner inputMoney = new Scanner(System.in);
        System.out.println("Nhập vào số tiền USD: ");
        int money = inputMoney.nextInt();
        System.out.println("Số tiền VNĐ là: " + money * rate + " đồng");
    }
}
