// Problem: Predict the day of the week after N days.
// Input: Current day (String) and number of days N (Integer).
// Logic: (CurrentDayIndex + N) % 7 gives the index of the future day.
import java.util.*;

public class Days_after_N_days  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.next();     //nextline for a sentence and next for a single word
        int N = sc.nextInt();
        int dayv = 0;

        if (day.equals("Monday"))   //<-----------------
             dayv = 1;
        else if (day.equals("Tuesday")) 
            dayv = 2;
        else if (day.equals("Wednesday")) 
            dayv = 3;
        else if (day.equals("Thursday"))
             dayv = 4;
        else if (day.equals("Friday"))
             dayv = 5;
        else if (day.equals("Saturday"))
             dayv = 6;
        else if (day.equals("Sunday"))
             dayv = 7;

        int finalday = (dayv + N) % 7;

        switch (finalday) {
            case 1: System.out.println("Monday");
                break;
            case 2: System.out.println("Tuesday");
                break;
            case 3: System.out.println("Wednesday");
                 break;
            case 4: System.out.println("Thursday"); 
                break;
            case 5: System.out.println("Friday");
                 break;
            case 6: System.out.println("Saturday"); 
                break;
            case 0: System.out.println("Sunday");
                 break;
        }
    }
}
