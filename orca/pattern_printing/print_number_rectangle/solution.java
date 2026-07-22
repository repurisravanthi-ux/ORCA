import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        
        for(int i = 1; i <= R; i++) {      
            for(int j = 1; j <= C; j++) {   
                System.out.print(j);
                if(j != C) {           
                    System.out.print(" ");
                }
            }
            System.out.println();           
        }
        
        sc.close();
    }
}