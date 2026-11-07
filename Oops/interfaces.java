interface Animal{
    void walk(); 
}

// class Horse implements Animal{
//     public void walk(){
//         System.out.println("Walks on 4 legs");    
//     }
// }

interface Harbivore{

}

class Horse implements Animal , Harbivore {
    public void walk(){
        System.out.println("walks on 6 legs");      // Multiple interface is possible 
    }
}

public class interfaces {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
    
}
