// *        N= Total no of levels
// **       H= Weight of head level
// ***      I= Weight increment of each subsequent level
// ****            N=5  H=10  I=2     Output= 230
// ***** 
//Level 1= 1 star*10= 10
//Level 2= 2 star*12= 24
//Level 3= 3 star*14= 42
//Level 4= 4 star*16= 64
//Level 5= 5 star*18= 90
import java.util.*;
public class Weight_hill_pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int H= sc.nextInt();
        int I= sc.nextInt();
        int sum=0;
        for(int i=1; i<=N; i++){
            sum+= H*i;
            H+=I;
        }
        System.out.println(sum);
    }
}
