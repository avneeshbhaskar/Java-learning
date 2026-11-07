class pen {    //class is always written in starting first capital latter
    String color;
    String type; // ballpoint ; gel

    public void write(){
        System.out.println("Write Something");
    }

    public void printColor(){
        System.out.println(this.color);
    }

    

}

class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Student(String name , int age){
    //     this.name = name;
    //     this.age = age;
    //     System.out.println("This is parametarised constructor");
    // }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;   
    }

    Student(){

    }

}

public class classAndObject {
    public static void main(String args[]){
        pen pen1 = new pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen pen2 = new pen();
        pen2.color = "black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();



        Student s1 = new Student();
        s1.name = "Avneesh";
        s1.age = 20;

        Student s2 = new Student(s1);
        s2.printInfo();
    }
}