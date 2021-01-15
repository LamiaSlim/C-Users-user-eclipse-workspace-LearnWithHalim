package basic;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your ID");
		String ID = input.nextLine();
		System.out.println("MY ID : "+ID);
		
		System.out.println("Enter your last name");
		String lastName = input.nextLine();
		System.out.println("Last Name : "+lastName);
		
		System.out.println("Enter student Fee");
		double studentFee=input.nextDouble();
		System.out.println("Student fee is "+studentFee);
	
		
		
		// To close scanner
		input.close();
		
		
	}
	
	
	
	
	
	
}
