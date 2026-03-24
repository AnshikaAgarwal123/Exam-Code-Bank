//input- [1,1,1,2,2,3,4]
//output- 4
//Explanation- No. of non duplicate elements.
import java.util.*;
import java.util.Arrays;

public class Remove_duplicate {
    public static void main(String[] args) {
        // code
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for(int i=0; i<n; i++){
            array[i] = sc.nextByte();
        }
        Arrays.sort(array);

        int x = 1;
        for(int i = 1; i < n; i++){
            if(array[i] != array[i-1]){
                array[x] = array[i];
                x++;
            }
        }
        System.out.println(x);
    }
}