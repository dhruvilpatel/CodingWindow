package strings;

import java.text.DecimalFormat;
// Blackrock
public class CalculateInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "30000~10~6~5000";
		
		String[] values = input.split("~");
		
		int loan = Integer.parseInt(values[0]);
		int year = Integer.parseInt(values[1]);
		int annualRate = Integer.parseInt(values[2]);
		int downpayment = Integer.parseInt(values[3]);
		
		int interestLoan = loan - downpayment;
		
		double month = year * 12;
		double montlyRate = (double)annualRate / 1200;
		DecimalFormat format = new DecimalFormat("#.00");
		double interest = ((interestLoan * montlyRate)/ (1 - Math.pow((1 + montlyRate),-month)));
		
		System.out.println(format.format(interest));
	}
	
	
	
	
}
