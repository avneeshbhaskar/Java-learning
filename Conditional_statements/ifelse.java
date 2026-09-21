package Conditional_statements;

public class ifelse {
    public static void main(String[] args) {
        int age = 5;
        if(age>=18){
            System.out.println("You can vote and you can drive");
        }
        if(age > 13 && age <18){
            System.out.println("Teenager");
        }
        if(age > 2 && age < 10){
            System.out.println("Child");
        }
        else{
            System.out.println("You can't vote and drive");
        }
}
}