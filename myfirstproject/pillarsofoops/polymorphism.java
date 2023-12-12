/*
 * Two types of polymorphism
 * 1->function overloading->compile time polymorphism
 * 2->function overriding->run time polymorphism 
 */

 //compile time polymorphism->means many forms
 //function overloading

 //mostly we do it like giving multiple parameters
 //if they are having same name
 
 /**
  * polymorphism
  */


 class Student{
    String name;
    int age;
    public void info(String name){
        System.out.println(name);
        System.out.println();
    }

    public void info(int age){
        System.out.println(age);
        System.out.println();
    }

    public void info(String name,int age){
        System.out.println(name+" "+age);
        System.out.println();
       
    }
 }
 public class polymorphism {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shivam";
        s1.age = 19;

        s1.info(s1.age);
        s1.info(s1.name);
        s1.info(s1.name, s1.age);
    }
 }


 //if we want to  pass the same parameter with same name then
 // we must use different return type


 //or it must have differnt no of arguments passed
 //or it should have different name 


 //this is function overloading or compile time polymorphism
 //which is a part of polymorphism in oops
 