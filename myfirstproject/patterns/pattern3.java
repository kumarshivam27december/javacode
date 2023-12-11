import java.util.*;
public class pattern3 {
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);
        int input = cin.nextInt();
        for (int i = 0; i < input; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
