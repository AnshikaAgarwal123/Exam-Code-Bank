//Input-5   0 1 0 3 12
//Output- 1 3 12 0 0
import java.util.*;
import java.util.Arrays;

public class Move_zeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int arr1[] = new int[n];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            }
        }

        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr1[x] = arr[i];
                x++;
            }
        }

        for (int i = arr.length - count; i < arr.length; i++) {
            arr1[i] = 0;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}