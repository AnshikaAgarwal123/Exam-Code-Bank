//If a number after rearrngement can be formed a palindrome then return 2 otherwise return 1
//A number can be palindrome if it has at most 1 digit occurs odd number of times.
//input- 2125   output-1    input- 21312    output-2
import java.util.*;
public class Palindrome_possibility_check {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int oddcount=0;

        int counts[]= new int[10];  //<----Form an array
        while(num>0){
            int digit=num%10;
            num/=10;
            counts[digit]++;
        }

        for(int i=0; i<10; i++){
            if (counts[i]%2!=0){
                oddcount++;
            }
        }

        if(oddcount%2==0){
            System.out.println('1');
        }
        else
             System.out.println("2");
    }
}
