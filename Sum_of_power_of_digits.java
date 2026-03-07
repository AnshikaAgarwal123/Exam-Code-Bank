//Example:-
// input- 582109
// output- 5^8 + 8^2 + 2^1 + 1^0 + 0^9 + 9^0
//         =390625+ 64 + 2 + 1 + 0 + 1
//         =390693
import java.util.*;

public class Sum_of_power_of_digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        int power1 = 0;
        long sum = 0;
        
        while (number > 0) {
            int digit = (int) (number % 10);
            number /= 10;
            sum += (long) Math.pow(digit, power1);
            power1 = digit;
        }
        
        System.out.println(sum);
    }
}