import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        int totalChars = 0;

        for (int i = 0; i < N; i++) {
            String line = sc.nextLine();
            totalChars += line.length();
        }

        System.out.println(totalChars);
    }
}