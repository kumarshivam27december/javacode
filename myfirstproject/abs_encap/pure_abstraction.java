interface Animal{
    int eyes =  2;//fixed for all animals
    //it will be static,final and public




    void walk();
    //by default it is public and abstarct
    // public void eat();//non abstract function cannot be used
    //we acn't make any function also in this
    // Animal(){
    //     System.out.println("This is animal constructor");
    // }we cannot make constructors in interface
}
interface Herbivorous{

}
class Horse implements Animal,Herbivorous{
    public void walk(){
        System.out.println("Walking with 4 leg");
    }
    Horse(){
        System.out.println("This is horse constructor");
    }

}
// class Chicken extends Animal{
//     public void walk(){
//         System.out.println("walking with 2 leg");
//     }
// }

public class pure_abstraction {
    public static void main(String[] args) {
        
    }
}
//multiple interface and be used using comma

//multiple inheritance is not present in classes in java 
//but present in interfaces



