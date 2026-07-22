import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();      // Age
        double I = sc.nextDouble(); // Annual Income

        double tax = 0.0;

        if (A < 60) { // General
            if (I <= 300000) {
                tax = 0;
            } else if (I <= 1000000) {
                tax = (I - 300000) * 0.10;
            } else {
                tax = 70000 + (I - 1000000) * 0.20;
            }
        } 
        else if (A < 80) { // Senior
            if (I <= 500000) {
                tax = 0;
            } else if (I <= 1000000) {
                tax = (I - 500000) * 0.10;
            } else {
                tax = 50000 + (I - 1000000) * 0.20;
            }
        } 
        else { // Super Senior
            if (I <= 1000000) {
                tax = 0;
            } else {
                tax = (I - 1000000) * 0.20;
            }
        }

        System.out.printf("%.2f", tax);

        sc.close();
    }
}