import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double CP = sc.nextDouble();
        double SP = sc.nextDouble();

        if (SP > CP) {
            double profit = ((SP - CP) / CP) * 100;
            System.out.printf("Profit of %.2f%%", profit);
        } else if (SP < CP) {
            double loss = ((CP - SP) / CP) * 100;
            System.out.printf("Loss of %.2f%%", loss);
        } else {
            System.out.println("No Profit No Loss");
        }

        sc.close();
    }
}