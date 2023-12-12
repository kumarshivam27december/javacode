class Student{
    String name;
    int age;
    Student(){

    }
    Student(Student s2){
        this.name= s2.name;
        this.age = s2.age;
    }
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}
public class copy_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shivam";
        s1.age =19;

        Student s2 = new Student(s1);
        s2.info();

    }
}

//all copy constructors in java are user defined


//we don't write distructor in java as it already 
//have something called garbage collector
