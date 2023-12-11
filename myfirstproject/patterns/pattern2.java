// import java.util.*;
// public class pattern2 {
//     public static void main(String[] args){
//         Scanner cin =  new Scanner(System.in);
//         int input  = cin.nextInt();
//         for (int i = 0; i < input; i++) {
//             for (int j = 0; j < input-1; j++) {
//                 if (i==0 || i==(input-1) || j==0 ||(j==input-2)) {
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
//                 System.out.println();
//         }
//     }
// }
//alter

import java.util.*;


public class pattern2 {
   public static void main(String args[]) {
       int n = 5;
       int m = 4;
       for(int i=0; i<n; i++) {
           for(int j=0; j<m; j++) {
               if(i == 0 || i == n-1 || j == 0 || j == m-1) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
   }
}

