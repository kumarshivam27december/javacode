package abs_encap;
class Student{
    String name;
    static String School;
    public static void changeschool(){
        School = "LPU";
    }
}
public class static_keyword{
    /*
     * it is something that is commmon and
     * accessible to all
     * for e.g.
     * School name of all Student class 
     * wil be same
     */

     public static void main(String[] args) {
        Student.School = "lpu";
        //this is common to all so
        //we can directly give the name
        //there is not any requirent of giving it individually

        //static is a thing  of class rather than of the object
        //so it is same or common for all the objects
        Student student1 = new Student();
        student1.name = "Rahul";
        System.out.println(student1.School);
     }
}

//it is easier to change we changes only 1 
//and then it changes in all code
//changes all at once

/*
 * it can be used in 4 types
 * infront of property->data
 * infront of function->method
 * infront of block
 * in nested classes
 */

 //memory is only given only 1 time to static
 //whereas many time to object eac time it is 
 //initialised or called

 /*
 in conclusion if we want to share some common information
 then we use static keyword 
  
  */