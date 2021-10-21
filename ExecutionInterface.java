package week3.day1;

public class ExecutionInterface {

	public static void main(String[] args) {
		
	CalcTaxIndividuals objIndiv = new CalcTaxIndividuals();
	objIndiv.CalcDeduction("siva", 632.304, 742.890);
	objIndiv.CalcGrossIncome("niaranjana",7000000, 890);
	objIndiv.CalcGrossIncome("nive", 62067, 91090);
	
	objIndiv.CalGrossIncome();
	objIndiv.removeDeductions();
	
	}

}
