
public class CurrencyConverter {

	// attributes
	
   private static final double USD_TO_PULA  =13.57; 


	public static double CONVERT_USD_TO_PULA( double amount) {
		
		
		double convertedAmount = USD_TO_PULA * amount;
		
		return convertedAmount;
		
	}
	
	
	public static double CONVERT_PULA_TO_USD( double amount) {
		
		
		
	double convertedAmount = amount / USD_TO_PULA  ;
		
		return convertedAmount;
	}
}
