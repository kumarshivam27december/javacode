package all_basics;
public class everycode {

}

/* 

       conditional variable 


import java.util.*;

public class conditional {
    public static void main(String args[]){
        System.out.println("conditional statement\n");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>=18) {
            System.out.println("You are eligible\n");
        }else if(a==18){
            System.out.println("You are too young for it\n");
        }else{
            System.out.println("You are too young for it\n");
        }
        
    }
}


complete zero lecture



public class firstclass {
    public static void main(String[] args){
        //output
        System.out.println("hello world");//ln for next line
        System.out.print("hello world\n");
        System.out.println("hello world");
        System.out.println("\n");
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println("*****");

        //notes
        //inner components for compilation and execution of java file
        //jdk(java development kit)
        //  then jre(java runtime environment)
        //  then jvm (java virtual machine)
        //bytes code me convert karke it can be portable into any system
        //which make it convert into vary from cpp
        //executable file are saved in .class and are changed into bytes
        //jvm convert byte code into native code->machine understandable code
        //main part is executable part in java
        //function does a particular work for us
        //where class help to seperate one from the other
        //java is a typed language
        //i.e we have to predetermine the data types
        //they are of two types
        //primitive->bytes,short,char,boolean,int,long,float,double
        //non-primitive->string,array,class,inderitance,object
       
        
    }
}



variables


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
        String ab = sc.next();
        String ba = sc.nextLine();

        int k = sc.nextInt();
        int l =sc.nextInt();
        System.out.println(k+l);
        System.out.println(name);

    }
}





max and min problem



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

odd or even

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


calculator using switch

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




 */