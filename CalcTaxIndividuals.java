package week3.day1;

//Implementation class 
public class CalcTaxIndividuals implements TaxCalculation, IncomeCalculation{

	//from the interface
	public void CalcDeduction(String name, double HRA, double LTA) {
		System.out.println("CalcDeductio Individuals");
		
	}

	public void CalcGrossIncome(String name, double netIncome, double deduction) {
		 System.out.println(" CalcGrossIncome-Individuals");
	}

	
	public void CalGrossIncome(){
		System.out.println(" CalcGrossIncome-Individuals");
	}

	public void ClacGrossIncome() {
		// TODO Auto-generated method stub
		
	}

	public void removeDeductions() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
