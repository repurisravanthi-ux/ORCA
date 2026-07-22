import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        if (N >= 1 && N <= 100) {
            if (N % 2 == 0 && N % 3 == 0) {
                System.out.println("Divisible by 6");
            } else if (N % 2 == 0) {
                System.out.println("Divisible by 2");
            } else if (N % 3 == 0) {
                System.out.println("Divisible by 3");
            } else {
                System.out.println("Not divisible by 2 or 3");
            }
        } else {
            System.out.println("Out of Range");
        }

        sc.close();
    }
}