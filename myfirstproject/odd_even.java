import java.util.*;
public class odd_even {
    public static void main(String[] args){
        //code
        Scanner sc = new Scanner(System.in);
        int input  = sc.nextInt();
        if(input%2 !=0){
            System.out.println("Odd\n");
        }else{
            System.out.println("Even\n");
        }
    }
}
