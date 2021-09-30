import java.util.Scanner;

public class Assignment2 {
	
	public static void main(String arg[]) {
		
		//Scanner//
		Scanner scan = new Scanner(System.in);
		
		//Input of Card Type//
		System.out.println("Is the card a MasterCard \"Master\" or VisaCard \"Visa\"?");
		String cardType = scan.next();
		
		//Validation of Card Type//
		while(!(cardType.equals("Master") || cardType.equals("Visa"))){
			System.out.println("The card type is invalid please try again:");
			cardType = scan.next();
		}
		
		//Input of Card Number//
		System.out.println("Please enter the 16 digit card number:");
		long cardNumber = scan.nextLong();
		
		//16 digit valid range//
		long upperLimit = 10000000000000000L;
		long lowerLimit = 999999999999999L;
		
		//Validation of Card Number//
		while (cardNumber >= upperLimit || cardNumber <= lowerLimit) {
			System.out.println("The number is invalid please try again:");
			cardNumber = scan.nextLong();
		}
		
		//Determine the modulo from the Card Number//
		long sumOfDigits = 0;
		long num = cardNumber;
		while(num > 0) {
			sumOfDigits = sumOfDigits + num % 10;
			num = num / 10;
		}
		long moduloOfSum = sumOfDigits % 10;
		
		//Is the card valid?//
		if(cardType.equals("Master") && moduloOfSum == 1) {
			System.out.println("This is a valid Master Card");
		} else if (cardType.equals("Visa") && moduloOfSum == 0) {
			System.out.println("This is a valid Visa Card");
		} else {
			System.out.println("This is not a valid " + cardType + " Card");
		}
		
		scan.close();
		
	
	}
}
