import java.util.Scanner;

public class Tester {

	private static Scanner sc;

	public static void main(String[] args) {
		

		createMenu();

	}

	public static void createMenu() {

		while (true) {

			MenuBuilder();
			MenuOptionsProcessor();
		}
			

	}
	
	private static void MenuBuilder() {
		
		System.out.println("***********************************");
		System.out.println("*** BWP-USD Currency Conveter *****");
		System.out.println("***********************************");

		System.out.println();

		System.out.println("SELECT FROM MENU BELOW ");

		System.out.println("(1)USD TO BWP ");
		System.out.println("(2)BWP TO USD ");

	}
	
	private static void MenuOptionsProcessor() {
		
		sc = new Scanner(System.in);

		int option = sc.nextInt();

	
		double amount;

		switch (option) {

		case 1:
			System.out.println("ENTER AMOUNT(USD) YOU WANT TO CONVERT TO BWP ");
			 amount = sc.nextDouble();
				System.out.println();

			System.out.println("$" + amount + " TO BWP IS : " + Math.round
					(CurrencyConverter.CONVERT_USD_TO_PULA(amount)));
			System.out.println();
			break;
		case 2:
			System.out.println("ENTER AMOUNT(BWP) YOU WANT TO CONVERT TO USD");
			System.out.println();

			 amount = sc.nextDouble();
			System.out.println("P" +amount + " TO USD IS : " + Math.round
					(CurrencyConverter.CONVERT_PULA_TO_USD(amount)));
			System.out.println();

			break;
		default:
			System.out.println("Wrong input");
			System.out.println();

			break;

		
	
	
	
	}
	}

}
