import java.util.Scanner;
public class can_place_flowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int array[]= new int[n];
        for(int i=0;i<n;i++){
            array[i]= sc.nextInt();
        }
        int expcount= sc.nextInt();
        int count=0;
        if(array[0]==0 && array[1]==0){
            array[0]=1;
            count++;
        }
        for(int i=1; i<n-1; i++){
            if(array[i-1]==0 && array[i+1]==0 && array[i]==0){
                array[i]=1;
                count++;
            }
            if(array[n-1]==0 && array[n-2]==0){
            array[n-1]=1;
            count++;
            }
            if(count>=expcount){
                System.out.println("true");
                return;
            }
        }
        
        System.out.println("false");
    }
}
