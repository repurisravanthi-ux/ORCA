import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int temp = N;
        int r= 0;

        while (N > 0) {
            int a = N % 10;
            r = r * 10 + a;
            N = N / 10;
        }

        if (temp == r) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}