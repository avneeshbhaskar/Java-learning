abstract class Animal {
    abstract void walk();
    public void eat(){
        System.out.println("Animals can eats");
    }
    Animal(){
        System.out.println("You are creating a new animal");
    }
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 leg");
    }
    Horse(){
        System.out.println("Created a horse");
    }
}

class Chicken extends Animal{

    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }

}
