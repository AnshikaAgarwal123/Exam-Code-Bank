//Number of Senior Citizens
// You are given an array of 15-character strings, each containing a passenger's phone number,
// gender, age, and seat number. Your task is to extract the 12th and 13th characters 
// (which represent the age) and count how many passengers are strictly older than 60 years.
import java.util.*;
public class No_of_senior_citizens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] array = new String[n];
        
        for (int i = 0; i < n; i++) {
            array[i] = sc.next();
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            String word = array[i];
            
            // Extracting the 12th and 13th characters (index 11 and 12)
            int digit1 = word.charAt(11) - '0';
            int digit2 = word.charAt(12) - '0';
            
            // Forming the age from the two digits
            int result = digit1 * 10 + digit2;
            
            if (result > 60) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
