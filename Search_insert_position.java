import java.util.*;
import java.util.Arrays;

public class Search_insert_position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter target element");
        int target = sc.nextInt();
        Arrays.sort(array);
        int index = -1;

        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                index = i;
                System.out.println(i);
                return;
            }
        }

        if (index == -1) {
            for (int i = 0; i < n; i++) {
                if (array[i] < target) {
                    index = i + 1;
                }
            }
        }

        if (index == -1) {
            System.out.println("0");
            return;
        }

        System.out.println(index);
    }
}