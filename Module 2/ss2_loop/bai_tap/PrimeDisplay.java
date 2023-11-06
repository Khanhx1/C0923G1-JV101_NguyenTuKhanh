package loop.bai_tap;

import java.util.Scanner;

public class PrimeDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter quantity of primes you want to display:");
        int numbers = scanner.nextInt();
        int count;
        int countPrime = 0;
        int n = 2;
        System.out.println("result:");
        while (countPrime <= numbers) {
            count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(n + ", ");
                countPrime++;
            }
            n++;
        }
    }
}
