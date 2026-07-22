import java.util.*;
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
     int B=sc.nextInt();
      int C=sc.nextInt();
      int largest;
      if (A >= B && A >= C) 
      {
            largest = A;
        }
         else if (B >= A && B >= C) 
         {
            largest = B;
        }
         else
          {
            largest = C;
        }
        
        System.out.println(largest);
        sc.close();
    }
}