package Loops.While;
import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int original = n;
		int rev = 0;
		while (n != 0) {
			int lastDigit = n % 10;
			rev = rev * 10 + lastDigit;
			n = n / 10;
		}
		if (original == rev) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}

		sc.close();
	}

}