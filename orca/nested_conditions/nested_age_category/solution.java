import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        if (A < 0 || A > 150) {
            System.out.println("Invalid");
        } 
        else if (A >= 0 && A <= 2) {
            System.out.println("Infant");
        } 
        else if (A >= 3 && A <= 12) {
            if (A >= 3 && A <= 7) {
                System.out.println("Child (Junior)");
            } else {
                System.out.println("Child (Senior)");
            }
        } 
        else if (A >= 13 && A <= 17) {
            System.out.println("Teenager");
        } 
        else if (A >= 18 && A <= 59) {
            if (A >= 18 && A <= 35) {
                System.out.println("Adult (Young)");
            } else {
                System.out.println("Adult (Middle)");
            }
        } 
        else {
            System.out.println("Senior Citizen");
        }

        sc.close();
    }
}