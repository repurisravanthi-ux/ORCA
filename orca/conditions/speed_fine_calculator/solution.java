import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt(); 
        int L = sc.nextInt(); 

        int diff = S - L;

        if (diff <= 0) {
            System.out.println("No Fine");
        } else if (diff <= 10) {
            System.out.println("Fine: 500");
        } else if (diff <= 20) {
            System.out.println("Fine: 1000");
        } else {
            System.out.println("Fine: 2000");
        }
    }
}