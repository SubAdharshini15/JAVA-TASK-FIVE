package Programs;

import java.util.Scanner;

public class ProgramOne {
	public static void main(String[] args) {
		int rem, temp, sum = 0;
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("Enter the number : " + number);
		temp = number;
		while (number > 0) {
			rem = number % 10;
			sum = (sum * 10) + rem;
			number = number / 10;
		}
		if (temp == sum) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("Not a Palindrome Number");
		}
	}
}
