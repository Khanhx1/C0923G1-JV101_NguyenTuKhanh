package introduction_of_java.thuc_hanh;
import java.util.Scanner;
public class DayOfMonth {
    public static void main(String[] args) {
        Scanner month = new Scanner(System.in);
        System.out.println("type month");
        byte inputMonth = month.nextByte();
        switch (inputMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month " + inputMonth + " has 31 days");
                break;
            case 2:
                System.out.println("Month " + inputMonth + " has 28 or 29 days");
                break;
            default:
                System.out.println("Month " + inputMonth + " has 30 days");
        }
    }
}
