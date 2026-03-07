//Input-212
//Output- No. of unique digits= 2
//input- 0121   output=2    It will not count the leading zeroes, for that use string.
import java.util.*;
public class Unique_digits_count {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int count=0;
        int counts[]= new int[10];

        if(num==0){
            System.out.println("1");
        }

        while(num>0){
            int digit= num%10;
            num/=10;
            counts[digit]++;
        }

        for(int i=0; i<10; i++){
            if(counts[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}