package week3.day1;

public interface TaxCalculation {
	
	//business       (team1)
	//Individual     (team2)
	//coopertarative (team3)
	
/**
 * 
 * @param name
 * @param HRA     //these line inside the /** code is called the documentation  ,/** and enter
 * @param LTA
 */
	
	void CalcDeduction(String name,double HRA,double LTA);//this is uniplemented menthod the interface
	
	
	
	
	/**
	 * 
	 * @param name
	 * @param netIncome
	 * @param deduction
	 */
	void CalcGrossIncome(String name,double netIncome,double deduction);
}
