package Conditional_statements;

public class prob04 {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;
        int c = 10;

        if(a >= b && a >=c){
            System.out.println("A is largest of 3");
        }
        else if(b >= a && b >= c){
            System.out.println("B is largest of 3");
        }
        else{
            System.out.println("C is largest of 3");
        }
    }
    
}
