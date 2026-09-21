package Loops.While;
import java.util.*;
public class prob03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int n = sc.nextInt();
        while(i <= n){
            System.out.println(i);
            i++;
        }
        sc.close();
        System.out.println("I did it successfully 😊");
    }
    
}
