package introduction_of_java.bai_tap;

import java.util.Scanner;

public class ConvertNumberToWord {
    public static void main(String[] args) {
        System.out.println("Nhập số cần đọc: ");
        Scanner inputNumber = new Scanner(System.in);
        int number = inputNumber.nextInt();
        String result = "";
        String finalResult;
        String[] ones = {" ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        int tens;
        if (number >= 100) {
            tens = number - 100 * (number / 100);
        } else {
            tens = number;
        }
        switch (tens) {
            case 0:
                result = "zero";
                break;
            case 1:
                result = ones[1];
                break;
            case 2:
                result = ones[2];
                break;
            case 3:
                result = ones[3];
                break;
            case 4:
                result = ones[4];
                break;
            case 5:
                result = ones[5];
                break;
            case 6:
                result = ones[6];
                break;
            case 7:
                result = ones[7];
                break;
            case 8:
                result = ones[8];
                break;
            case 9:
                result = ones[9];
                break;
            case 10:
                result = "ten";
                break;
            case 11:
                result = "eleven";
                break;
            case 12:
                result = "twelve";
                break;
            case 13:
                result = "thirdteen";
                break;
            case 14:
                result = "fourteen";
                break;
            case 15:
                result = "fifteen";
                break;
        }
        if (tens >= 16 && tens <= 19) {
            result = ones[(tens - 10)] + "teen";
        }
        if (tens >= 20 && tens < 100) {
            if (tens < 30) {
                result = "twenty " + ones[tens - 20];
            } else if (number < 40) {
                result = "thirdty" + ones[tens - 30];
            } else {
                result = ones[tens / 10] + "ty " + ones[tens - (tens / 10) * 10];
            }
        }
        if (number >= 100) {
            if (number % 100 == 0) {
                finalResult = ones[number / 100] + " hundred";
            } else {
                finalResult = ones[number / 100] + " hundred and " + result;
            }
        } else {
            finalResult = result;
        }

        System.out.println(finalResult);
    }
}
