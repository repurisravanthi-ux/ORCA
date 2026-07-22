import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int B = sc.nextInt();      // Account Balance
        String T = sc.next();      // Account Type (savings/current)
        int W = sc.nextInt();      // Withdrawal Amount

        if (T.equals("savings")) {
            if (W > 20000) {
                System.out.println("Transaction Limit Exceeded");
            } else if (W > B) {
                System.out.println("Insufficient Balance");
            } else {
                B = B - W;
                System.out.println("Withdrawal Successful: " + B);
            }
        } 
        else if (T.equals("current")) {
            if (W > 50000) {
                System.out.println("Transaction Limit Exceeded");
            } else if (W > B) {
                System.out.println("Insufficient Balance");
            } else {
                B = B - W;
                System.out.println("Withdrawal Successful: " + B);
            }
        }

        sc.close();
    }
}