import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String player1 = sc.next();
        String player2 = sc.next();

        if (player1.equals(player2)) {
            System.out.println("Draw");
        } 
        else if ((player1.equals("rock") && player2.equals("scissors")) ||
                 (player1.equals("scissors") && player2.equals("paper")) ||
                 (player1.equals("paper") && player2.equals("rock"))) {
            System.out.println("Player 1 Wins");
        } 
        else {
            System.out.println("Player 2 Wins");
        }

        sc.close();
    }
}