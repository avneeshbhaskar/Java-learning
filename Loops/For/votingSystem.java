package Loops.For;

import java.util.*;

public class votingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("You have id or not Answer in true or false : ");
        boolean hasId = sc.nextBoolean();
        // boolean hasId = true;
        if (age >= 18 && age <= 60) {
            System.out.println("You can vote");
            if (hasId) {
                System.out.println("You are eligible");
            } else {
                System.out.println("Required id card to vote");
            }
        } else {
            System.out.println("You can't vote");
            sc.close();
        }

    }
}
