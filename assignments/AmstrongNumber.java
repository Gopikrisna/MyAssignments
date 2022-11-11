package week1.assignments;

public class AmstrongNumber {

	public static void printAmstrongNumber(int number) {
		int calculated = 0, remainder, value;
		value = number;
		while (value > 0)
		{
			remainder = value%10;
			calculated = calculated + (remainder*remainder*remainder);
			value = value /10;
		}
		if (value==calculated)
		{
			System.out.println("Number is a Amstrong number");
		}
		else
		{
			System.out.println("Number is not a Amstrong number");
		}
	}
	
	public static void main(String[] args) 
	{
	AmstrongNumber.printAmstrongNumber(371);	
	}

}
