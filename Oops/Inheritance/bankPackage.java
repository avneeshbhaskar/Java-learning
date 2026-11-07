package Inheritance;

import Bank.Account;

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

class Circle extends shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class bankPackage {
    public static void main(String[] args) {
        Account account1 = new Account();

        account1.name = "Avneesh bhaskar";
        System.out.println(account1.name);
    }  
    
}
