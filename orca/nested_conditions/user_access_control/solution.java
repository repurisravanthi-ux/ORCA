import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.next(); // Subscription Tier
        String F = sc.next(); // Feature Tier

        // Check subscription tier
        if (!(S.equals("free") || S.equals("pro") || S.equals("enterprise"))) {
            System.out.println("Invalid Tier");
        }
        // Check feature tier
        else if (!(F.equals("basic") || F.equals("advanced") || F.equals("premium"))) {
            System.out.println("Invalid Feature");
        }
        // Access rules
        else if (S.equals("enterprise")) {
            System.out.println("Access Granted");
        }
        else if (S.equals("pro")) {
            if (F.equals("basic") || F.equals("advanced")) {
                System.out.println("Access Granted");
            } else {
                System.out.println("Upgrade Required");
            }
        }
        else { // free
            if (F.equals("basic")) {
                System.out.println("Access Granted");
            } else {
                System.out.println("Upgrade Required");
            }
        }

        sc.close();
    }
}