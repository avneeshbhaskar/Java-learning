package Inheritance;

class shape{
    public void area(){
        System.out.println("displays area");
    }
}

class Triangle extends shape{
    public void area(int l, int h){
        System.out.println(l/2*l*h);
    }
}

class equilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(l/2*l*h);
    }
}

public class multiLevel {
    public static void main(String[] args) {
        
    }
    
}
