import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int W = sc.nextInt(); // Weight in kg
        int Z = sc.nextInt(); // Zone

        if (Z == 1) {
            if (W <= 5) {
                System.out.println(50);
            } else if (W <= 20) {
                System.out.println(100);
            } else {
                System.out.println(200);
            }
        } 
        else if (Z == 2) {
            if (W <= 5) {
                System.out.println(100);
            } else if (W <= 20) {
                System.out.println(250);
            } else {
                System.out.println(500);
            }
        } 
        else if (Z == 3) {
            if (W <= 5) {
                System.out.println(500);
            } else if (W <= 20) {
                System.out.println(1500);
            } else {
                System.out.println(3000);
            }
        } 
        else {
            System.out.println("Invalid Zone");
        }

        sc.close();
    }
}