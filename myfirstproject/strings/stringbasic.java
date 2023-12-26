// package strings;


//java is immutable
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

        String abc = "Shivam";
        String bcd = "Shivam";

        if (abc == bcd) {
            System.out.println("same");
        }else{
            System.out.println("Not same");
        }

        if (abc.equals(bcd)) {
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
        
        
        //alter compare //wrong answer it will give
        if (new String(abc)== new String(bcd)) {
            System.out.println("same");
        }else{
            System.out.println("not same");
        }



       
        // String names[] = new String[size];

        // for (int i = 0; i < size; i++) {
        //     names[i] = sc.nextLine();
        // }

        // for (int i = 0; i < size; i++) {
        //     System.out.println("name "+(i+1)+" is "+names[i]);
        // }



        //parseInt
        String str5 = "123";
        int b = Integer.parseInt(str5);
        System.out.println(b+2);
       
        //tostring method 
        String str6 =Integer.toString(b);
        System.out.println(str6);


        //replace i with e in string
        String newsString = "Shivam";
        String result = "";
        for (int i = 0; i < newsString.length(); i++) {
            if (newsString.charAt(i)=='i') {
                result+='e';
            }else{
                result+=newsString.charAt(i);
            }
        }

        System.out.println(result);




        //find name from email
        String nString = "Shivam@gmail.com";
        String names = "";
        for (int i = 0; i < nString.length(); i++) {
            if (nString.charAt(i)=='@') {
                break;
            }else{
                names+=nString.charAt(i);
            }
        }

        System.out.println(names);

// Substring
// The substring of a string is a subpart of it.
// public class Strings {
// public static void main(String args[]) {
       String naming = "TonyStark";
     
       System.out.println(naming.substring(0, 4));
//    }
// }
        
    }
}


