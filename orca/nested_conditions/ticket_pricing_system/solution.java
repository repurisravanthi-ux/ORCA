import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // Age
        int D = sc.nextInt(); // Day (1=Mon ... 7=Sun)

        boolean weekend = (D == 6 || D == 7);

        if (A < 12) {
            if (weekend)
                System.out.println(150);
            else
                System.out.println(100);
        } 
        else if (A <= 59) {
            if (weekend)
                System.out.println(300);
            else
                System.out.println(200);
        } 
        else {
            if (weekend)
                System.out.println(200);
            else
                System.out.println(150);
        }

        sc.close();
    }
}