//Input-5   1 2 3 4 5
//Output- yes
import java.util.*;
import java.util.Arrays;

public class Check_sorted_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                
            }
            else {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}