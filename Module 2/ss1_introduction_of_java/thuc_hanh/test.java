package introduction_of_java.thuc_hanh;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String result = "";
        result = "mm" + (num / 10) * 10;
        System.out.println(result);
    }
}
