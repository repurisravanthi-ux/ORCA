import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int P = sc.nextInt();
        int C = sc.nextInt();

        int total = M + P + C;
        int mathPhysics = M + P;

        // Check subject criteria
        if (M >= 65 && P >= 55 && C >= 50) {

            // Check total criteria
            if (total >= 190 || mathPhysics >= 140) {
                System.out.println("Eligible");
            } else {
                System.out.println("Failed Total Criteria");
            }

        } else {
            System.out.println("Failed Subject Criteria");
        }

        sc.close();
    }
}

