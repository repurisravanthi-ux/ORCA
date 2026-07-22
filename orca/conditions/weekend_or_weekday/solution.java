import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int D = sc.nextInt();

        if (D >= 1 && D <= 5) {
            System.out.println("Weekday");
        } else if (D == 6 || D == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Day");
        }

        sc.close();
    }
}