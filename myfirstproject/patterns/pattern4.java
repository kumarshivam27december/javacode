import java.util.*;
public class pattern4 {
   public static void main(String args[]) {
    Scanner cin  = new Scanner(System.in);
       int n = cin.nextInt();
      
       for(int i=n; i>0; i--) {
           for(int j=0; j<i; j++) {
                   System.out.print("*");
               } 
                System.out.println();
           }
          
       }
   }

