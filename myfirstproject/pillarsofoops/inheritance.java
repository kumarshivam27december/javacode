class Shape{
    String color;
}

class Triangle extends Shape{

}
public class inheritance {
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.color = "Red";
    }
}

/*
 * This is a property where a 
 * a process takes the data elements(mostly the variables) 
 * as well as the functions or members
 * 
 * it increases reusibility 
 * 
 * the base class or the parent class is the class from which we 
 * inherite or take the property
 * and the class which inherite the property of the base class
 * is known as sub-class or child class
 * 
 * 
 * 
 * 
 * 
 * there are 4-types of inheritance
 * 1. Single level inheritance
 * 
 * (in the single level inheritance there is just 1 base class 
 *  and one derived class)
 * 
 * 
 * syntax for single level inheritance is
 * 
 * class child_class_name extends base_class_name {
 * 
 * }
 * 
 * 2.multi-level inheritance
 * 3.hierarical inheritance
 * 4.hybrid-level inheritance(composition of two or more in heritance)
 *
 * 
 * 5.(not in form of classes but with interface we use them)
   (This is called multiple inheritance)
 */


