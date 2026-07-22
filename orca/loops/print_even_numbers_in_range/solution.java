import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
        int B=sc.nextInt();
        int num;
    if(A<=B){
        for(int i=A;i<=B;i++)
        {
            if(i%2==0)
            {
            System.out.print(i+" ");
            }
        }
    }
    else{
        System.out.println("None");
    }

    }
}