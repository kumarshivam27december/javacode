import java.util.*;

public class max_min {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a  =  sc.nextInt();
        int b = sc.nextInt();
        if (a>b) {
            System.out.println("a is greater than b\n");
        }else if (a==b) {
            System.out.println("a is equal to b\n");
        }else{
            System.out.println("b is greater than a\n");
        }
    }
}
