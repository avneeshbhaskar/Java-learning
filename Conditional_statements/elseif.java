package Conditional_statements;
import java.util.*;
public class elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 18 && age <= 20){
            System.out.println("You can vote and drive");
        }
        else if(age >= 5 && age <= 10){
            System.out.println("Child");
        }
        else if(age >= 11 && age <= 18){
            System.out.println("Teenager");
        }
        else if(age >= 18 && age <= 25){
            System.out.println("Adult and Bachlor");
        }
        else if(age >= 60){
            System.out.println("Out of the range");
        }
        sc.close();
    }
    
}
