package loop.bai_tap;
import java.lang.Math;
public class PrimeLessThan100 {
    public static void main(String[] args) {
        int number = 2;
        int count;
        while (number < 100) {
            count = 0;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if(number % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(number + ", ");
            }
            number++;
        }
    }
}
