class Shape{
    public void area(){
        System.out.println("Display area");
    }
}

class Triangle extends Shape{
    public void area(int length,int height){
        System.out.println("area of the triangle is "+(0.5*length*height));
    }
}

public class singlelevelinheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(3, 4);
    }
}
