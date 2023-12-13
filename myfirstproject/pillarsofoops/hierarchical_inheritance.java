
class Shape {
    public void area(){
        System.out.println("displaying area");
    }
    
}

class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(0.5*l*h);
    }
}
class Circle extends Shape{
    public void area(float r){
        System.out.println(3.14*r*r);
    }
}


public class hierarchical_inheritance {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.area(10);

        Triangle t1 = new Triangle();
        t1.area(5,4);
    }
}
