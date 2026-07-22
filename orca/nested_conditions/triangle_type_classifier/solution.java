import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // Check if triangle is valid
        if (A + B <= C || A + C <= B || B + C <= A) {
            System.out.println("Invalid");
        } 
        // Check for Equilateral
        else if (A == B && B == C) {
            System.out.println("Equilateral");
        } 
        // Check for Isosceles
        else if (A == B || B == C || A == C) {
            System.out.println("Isosceles");
        } 
        // Otherwise Scalene
        else {
            System.out.println("Scalene");
        }

        sc.close();
    }
}