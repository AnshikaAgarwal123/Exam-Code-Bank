//Input- 3  3 2 3
//Output- 3
//Input- 7  2 2 1 1 1 2 2 
//Output- 2
import java.util.*;
import java.util.Arrays;

public class Majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                System.out.println(arr[i]);
                return;
            }
        }
    }
}
