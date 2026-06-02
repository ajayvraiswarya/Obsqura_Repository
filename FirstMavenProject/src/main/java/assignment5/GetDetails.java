package assignment5;

import java.util.Scanner;

public class GetDetails {
	
	double basicPay;
	double deduction;
	double bonus;
	
	Scanner sc = new Scanner(System.in);
	
	public void getInput()
	{
		System.out.println("Enter Basic Pay:");
		basicPay = sc.nextDouble();

		System.out.println("Enter Deduction:");
		deduction = sc.nextDouble();

		System.out.println("Enter Bonus:");
		bonus = sc.nextDouble();
	}
	
	
	
	
}
