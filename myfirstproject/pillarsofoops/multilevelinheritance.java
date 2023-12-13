class Shape{
    public void area(){
          System.out.println("display area\n");  
    }
}
class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}

class Equilateral extends Triangle{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}
public class multilevelinheritance {
   public static void main(String[] args) {
     Triangle T1 = new Triangle();
     T1.area(9,8);
     Equilateral e1 = new Equilateral();
    e1.area(8,9);
   }
   
}
