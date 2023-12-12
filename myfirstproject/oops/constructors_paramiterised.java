class Student{
    String name;
    int age;

    Student(String name,int age){
        this.name = name;
        //this.name->shows object name
        //and RHS name is paramitirised name
        this.age = age;
        //this.age->is object age
        //and RHS age is paramitire as age
    }

    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

}
public class constructors_paramiterised {
    public static void main(String[] args){
        Student s1 = new Student("Shivam",19);
        s1.info();
    }
}
