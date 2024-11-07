package Programs;

import java.util.Scanner;

public class ProgramSeven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		System.out.println("Enter Number : " + number1);
		System.out.println("Enter Number : " + number2);
		System.out.println("Enter Number : " + number3);
		if (number1 > number2) {
			if (number1 > number3) {
				System.out.println("Number1 is greater" + number1);
			} else {
				System.out.println("Number3 is greater" + number3);
			}
		} else if (number1 < number2) {
			if (number2 < number3) {
				System.out.println("Number3 is greater" + number3);
			} else {
				System.out.println("Number2 is greater" + number2);
			}
		} else {
			System.out.println("Number3 is greater" + number3);
		}
	}
}
