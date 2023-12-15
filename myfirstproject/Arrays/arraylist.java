import java.util.ArrayList;
import java.util.Collections;
public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list1.add(2);
        list1.add(3);
        list1.add(1);
        list1.add(5);

        System.out.println(list1);

        list1.remove(1);

        System.out.println(list1);


        list1.add(2,10);


        Collections.sort(list1);

        System.out.println(list1);


        list1.set(0, 100);

        int element = list1.get(2);
        System.out.println(element);

        int size = list1.size();
        System.out.println("size of list is "+size);
        
        System.out.println(list1);
        
        System.out.println();
        
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i)+ " ");
        }
    
    
    }
}
