package Conditional_statements;

public class ternaryOP {
    public static void main(String[] args) {
        int number = 5;
        //ternary operator
        String type = ((number % 2) == 0)? "Even" : "Odd";
        System.out.println(type);
    }
    
}
