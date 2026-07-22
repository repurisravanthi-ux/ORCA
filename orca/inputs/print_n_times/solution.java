import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine(); 
        int n = sc.nextInt();     
        
        for(int i = 0; i < n; i++) {
            System.out.print(s); 
            if(i < n - 1) {
                System.out.print(" "); 
            }
        }
        sc.close();
    }
}