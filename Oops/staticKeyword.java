class student{
    String name;
    static String School;
}

public class staticKeyword {
    public static void main(String[] args) {
       student.School = "Bajaj public School";
       System.out.println(student.School);

       student student1 = new student();
       student1.name = "Avneesh"; 
       System.out.println(student1.name);
    }
}
