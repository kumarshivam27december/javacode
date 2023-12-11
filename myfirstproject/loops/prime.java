import java.util.*;
public class prime {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int input = cin.nextInt();
        boolean prime = true;
        for(int i=2;i<input;i++){
            if(input%i==0){
                prime = false;
                break;
            }
        }

        if (prime==true) {
            System.out.println("It is prime\n");
        }else{
            System.out.println("No it is not prime\n");
        }
       
    }
}
