import java.util.*;
public class variables{
    public static void main(String[] args) {
        //variables
        int a = 90;
        int b= 110;
        int c = a+b;
        System.out.println(c);
        System.out.println(a);
        
        int d = (a*b)/(a+b);
        System.out.println(d);

        //arthimatic operation using user input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int k = sc.nextInt();
        int l =sc.nextInt();
        System.out.println(k+l);
        System.out.println(name);

    }
}
