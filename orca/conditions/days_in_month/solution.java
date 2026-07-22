import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int Y = sc.nextInt();

        switch (M) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(31);
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(30);
                break;

            case 2:
                if ((Y % 400 == 0) || (Y % 4 == 0 && Y % 100 != 0)) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
                break;
        }
    }
}