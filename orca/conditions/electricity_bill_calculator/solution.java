import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int U = sc.nextInt();
        double bill;

        if (U <= 100) {
            bill = U * 1.50;
        } else if (U <= 200) {
            bill = 100 * 1.50 + (U - 100) * 2.50;
        } else if (U <= 300) {
            bill = 100 * 1.50 + 100 * 2.50 + (U - 200) * 4.00;
        } else {
            bill = 100 * 1.50 + 100 * 2.50 + 100 * 4.00 + (U - 300) * 6.00;
        }

        System.out.printf("%.2f", bill);
    }
}