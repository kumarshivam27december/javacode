import java.util.*;
public class switchcase {
    public static void main(String[] args){
        System.out.println("\nswitchcase\n");
        System.out.println("calcular_construction\n");

            Scanner sc = new Scanner(System.in);
            System.out.println("enter user input 1\n");
            int a = sc.nextInt();
            System.out.println("enter user input 2\n");
            int b = sc.nextInt();

            System.out.println("press 1 for addition\n");
            System.out.println("press 2 for subraction\n");
            System.out.println("press 3 for multiplication\n");
            System.out.println("press 4 for division\n");


            int c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println(a+b);
                    break;
                case 2:
                    System.out.println(a-b);
                    break;
                case 3:
                    System.out.println(a*b);
                    break;
                case 4: 
                    System.out.println(a/b);
                    break;
                default:
                    break;
            }
            
    }
}


