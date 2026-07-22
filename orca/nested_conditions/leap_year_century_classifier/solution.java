import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Y = sc.nextInt();

        if (Y % 100 == 0) { // Century year
            if (Y % 400 == 0) {
                System.out.println("Century Leap Year");
            } else {
                System.out.println("Century Normal Year");
            }
        } else { // Non-century year
            if (Y % 4 == 0) {
                System.out.println("Non-Century Leap Year");
            } else {
                System.out.println("Non-Century Normal Year");
            }
        }

        sc.close();
    }
}