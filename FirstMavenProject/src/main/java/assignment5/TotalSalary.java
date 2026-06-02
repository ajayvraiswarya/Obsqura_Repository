package assignment5;

public class TotalSalary extends Calculations{
	
	double total;
	public void totalSalary()
	{
		getInput();
		//calculateDeduction();
		total = basicPay + hra - pf - deduction + bonus;
		System.out.println("The total salary is " +total);
	}

	public static void main(String[] args) {
		
		TotalSalary obj = new TotalSalary();
		obj.totalSalary();
	}

}
