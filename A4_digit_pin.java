//Input- 123 582 175
// Units: min(3,2,5)=2
//Tens: min(2,8,7)=2
//Hundreds: min(1,5,1)=1
//Thousands: max(1,2,3,5,8,2,1,7,5)=8
//Output: 8122


import java.util.*;

public class A4_digit_pin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        // Extract digits for Number 1
        int u1 = num1 % 10;
        int t1 = (num1 / 10) % 10;
        int h1 = num1 / 100;

        // Extract digits for Number 2
        int u2 = num2 % 10;
        int t2 = (num2 / 10) % 10;
        int h2 = num2 / 100;

        // Extract digits for Number 3
        int u3 = num3 % 10;
        int t3 = (num3 / 10) % 10;
        int h3 = num3 / 100;

        // 1. Find Min for Units, Tens, and Hundreds
        int minU = Math.min(u1, Math.min(u2, u3));
        int minT = Math.min(t1, Math.min(t2, t3));
        int minH = Math.min(h1, Math.min(h2, h3));

        // 2. Find Max of all 9 digits
        int max1 = Math.max(u1, Math.max(t1, h1));
        int max2 = Math.max(u2, Math.max(t2, h2));
        int max3 = Math.max(u3, Math.max(t3, h3));
        int maxAll = Math.max(max1, Math.max(max2, max3));

        // 3. Assemble the 4-digit PIN
        int pin = (maxAll * 1000) + (minH * 100) + (minT * 10) + minU;

        System.out.println(pin);
    }
}
