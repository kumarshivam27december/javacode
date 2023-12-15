
import java.util.*;
public class check_sorted {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int size  = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        boolean issorted = true;

        for (int i = 0; i < size-1; i++) {
            if (arr[i]>arr[i+1]) {
                issorted = false;
                break;
            }
        }

        if (issorted) {
            System.out.println("It is sorted");
        }else{
            System.out.println("not sorted");
        }
        
    }
}
