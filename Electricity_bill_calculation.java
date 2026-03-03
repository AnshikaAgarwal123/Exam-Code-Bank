//// Problem: Calculate electricity bill based on units consumed (U).
// Logic: 0-100 units @ 1/unit, 101-200 units @ 2/unit, >200 units @ 3/unit.
// Each tier adds to the base cost of the previous tiers.
import java.util.*;

public class Electricity_bill_calculation {
    public static void main(String[] args) {
        // code
        Scanner sc = new Scanner(System.in);
        int U = sc.nextInt();
        int bill = 0;

        if (U > 200) {
            int finalU = U - 200;
            bill = finalU * 3 + 300;
        } 
        else if (U > 100) {
            int finalU = U - 100;
            bill = finalU * 2 + 100;
        } 
        else {
            bill = U * 1;
        }

        System.out.println(bill);
    }
}