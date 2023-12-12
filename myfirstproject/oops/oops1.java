class Pen{
    String color;
    String type;//ball gel

    public void write(){
        System.out.println("Write something\n");
    }

    public void printcolor(){
        System.out.println(this.color);
    }
    public void printtype(){
        System.out.println(this.type);
    }
}

class Student{
    String name;
    int age;
    float fees;
    double other_expense;
    String batch;
    String regno;

    void printname(){
        System.out.println(this.name);
    }
     void printbatch(){
        System.out.println(this.batch);
    }
     void printregno(){
        System.out.println(this.regno);
    }
     void printage(){
        System.out.println(this.age);
    }
     void printfees(){
        System.out.println(this.fees);
    }
     void printotherexpenses(){
        System.out.println(this.other_expense);
    }
}
public class oops1 {

    public static void main(String[] args){
        Pen pen1 = new Pen();
        pen1.color = "green";
        pen1.type = "gel";
        pen1.write();
        pen1.printcolor();
        pen1.printtype();

        //this keyword is used to give the current 
        //instance of the object

        //this show which object it to be used 

        Pen pen2 = new Pen();
        pen2.color = "Pink";
        pen2.type = "ball";
        pen2.write();
        pen2.printcolor();
        pen2.printtype();

        System.out.println();
        System.out.println();
        System.out.println();

        Student student1 = new Student();
        student1.name = "rahul";
        student1.age = 19;
        student1.batch = "CSE";
        student1.fees = 120000.00f;
        student1.other_expense = 10000.00;
        student1.regno = "12215334";


        student1.printage();
        student1.printbatch();
        student1.printfees();
        student1.printname();
        student1.printotherexpenses();
        student1.printregno();


        System.out.println();
        System.out.println();
        System.out.println();
        Student student2 = new Student();
        student2.age = 10;
        student2.batch = "ece";
        student2.fees = 125000.00f;
        student2.name = "shivam";
        student2.other_expense = 15000.00;
        student2.regno = "12223344";


        student2.printage();
        student2.printbatch();
        student2.printfees();
        student2.printname();
        student2.printotherexpenses();
        student2.printregno();
    }
}

/* 
note that data is known as elements of a particular class in oops
whereas member is function in the oops 


new keyword is used to store all memory for the 
object in the heap
i.e new Student();
where afyter new keyword is constructors
3 properties of constructors
1. It is same as the name of the class
2. It is of no return type none of int,void,string
3.It is only called when to create an object
there are 3 types of constructors
1.non paramitirised constructor(by default java make this)
even if we donot make this
if we make it then it will call or else it is made by automaticaaly

2.paramitised constructor 
3.copy constructor 

NOTE :-> destructor is not needed in java 
as it have garbage collector which automatically remove 
unwanted memory allocated


*/