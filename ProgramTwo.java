package Programs;

import java.util.Scanner;

public class ProgramTwo {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String Name = sc.nextLine();
	
	for(int i = Name.length()-1;i >= 0; i--) {
		
		System.out.print(Name.charAt(i));
	}
	
}
}
