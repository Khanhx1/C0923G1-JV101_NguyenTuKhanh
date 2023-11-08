package array_and_method.bai_tap;
import java.util.Scanner;
public class AppearanceOfCharacterInString {
    public static int countChar (String string, String character) {
        int count = 0;
        char temp = character.charAt(0);
        for (int i = 0; i < string.length(); i++) {
            if(temp == string.charAt(i)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = "abcmnsmsa";
        System.out.println("Enter 1 character:");
        String inputChar = scanner.nextLine();
        System.out.println("character " + inputChar + " appear:");
        System.out.println(countChar(string, inputChar));
    }
}
