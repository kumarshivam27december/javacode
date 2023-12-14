// package abs_encap;
/*
 * Two types we can use
 * Method 1. ->using abstarct keyword
 * Method 2. ->using interface
 */
abstract class Animal{
    abstract void walk();
    /*
     * syntax
     * abstract void functionname();
     */
    public void eat(){
        System.out.println("animal eats");
    }
    Animal(){
        System.out.println("This is animal constructor");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("Walking with 4 leg");
    }
    Horse(){
        System.out.println("This is horse constructor");
    }

}
class Chicken extends Animal{
    public void walk(){
        System.out.println("walking with 2 leg");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Horse horse1 = new Horse();
        horse1.walk();
        Chicken chick1 = new Chicken();
        chick1.walk();

        /*
         * do we need to see the animal
         * class we are making horse class
         * and chicken class
         * because all the property of animal 
         * classes are directly coming into
         * the child class
         * 
         * so is there any need of user to go 
         * and check the animal class
         * so it is irrelevent
         * we don't need to shoe it to the user
         * 
         * so we will use abstract keyword
         * 
         * abstarct means it is a concept
         * a blueprint of other subclasses
         * which don't need to be true
         * it just exists , we can just think
         * about it, we can create it,but it cannot 
         * be use.
         * like they are not real
         * for example there is nothing specific
         * called animal it is a concept
         * the real animals are horse and chicken 
         * here
         */


         /*
          * properties
          * if we need the walk function in the 
          * animal so we can just keep it but it 
          * has no direct use so we can make this 
          * abstract
          *
          * we can make the animal walk function
          * as abstarct
          *
          *
          *
          *
          */

        //// Animal animal = new Animal() ;
        // cannot intitiate this type of
        //This is runtime error
        //happen at runtime
        //Cannot instantiate the type Animal

        /*
         * in abstract we can use both
         * abstract and non abstract function
         * 
         * 
         */
        horse1.eat();

        //first base class is called
        //then derived class is called
        //this is called constructor chaining in java


            
          
    }
}
//interfaces have pure abstraction
//it remove all useless information
