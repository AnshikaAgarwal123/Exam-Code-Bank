//9895= 9+8+9+5= 31 ---> 3+1=4
//This isn't working for 199.
import java.util.*;
public class Sum_of_sum_of_digits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        int sum=0;
        while(num>0){
            int digit= num%10;
            num/=10;
            sum+=digit;
            if(num==0){
                num=sum;
                if(sum<=10){
                    num=0;
                    System.out.println(sum);
                }
                sum=0;
            }
        }
        
    }
}

