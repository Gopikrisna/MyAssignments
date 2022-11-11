package week1.assignments;

public class ConvertNegativetoPostive 
{

	public static void main(String[] args) 
	{
		int num = -7;
		if(num < 0)
		{
			System.out.println("Negative to Positive Number is:\t"+Math.abs(num));
		}
		else 
		{
			System.out.println("Positive Number is \t"+Math.abs(num));
		}
	}

}
