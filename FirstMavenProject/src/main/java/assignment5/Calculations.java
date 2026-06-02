package assignment5;

public class Calculations extends GetDetails {
	double hra;
	double pf;
	
	public void calculateDeduction()
	{
		
		hra = .05 * basicPay;
		pf  = .20 * basicPay;
	}

}
