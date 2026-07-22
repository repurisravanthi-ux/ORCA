import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r=0;
        while(n!=0){
            int ld=n%10;
            r = r*10+ld;
            n = n/10;
        }
        System.out.println(r);
    }
}