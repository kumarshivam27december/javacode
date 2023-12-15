// package strings;


import java.util.*;



public class stringbasic {
    public static void main(String[] args) {
      
        Scanner sc  =  new Scanner(System.in);
        String  str = sc.next();
        System.out.println(str);
        String name = "stark";
        System.out.println(name);

        //concatination
        String fullname = str + " " + name;
        System.out.println(fullname);


        //length of the string
        System.out.println(fullname.length());


        //access a particular element

        System.out.println(fullname.charAt(2));
        
        //compare the string

        System.out.println("hello ");
    
    }
}
