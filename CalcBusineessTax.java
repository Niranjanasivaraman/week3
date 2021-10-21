package week3.day1;

public class CalcBusineessTax implements TaxCalculation {

	public void CalcDeduction(String name, double HRA, double LTA) {
		System.out.println("CalcDeduction - Business");
	}

	public void CalcGrossIncome(String name, double netIncome, double deduction) {
        System.out.println("CalcGrossIncome - Business");
     }

	public void taxslab(){
		System.out.println("Tax slab of individuals");
	}
	
}
