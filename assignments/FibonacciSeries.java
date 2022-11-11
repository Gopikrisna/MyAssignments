package week1.assignments;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class FibonacciSeries 
{

	public static void fibonacci(int n)
	{
		int firstNum = 0, secondNum=1, Sum=0;
		for (int i=1;i<n;i++)
		{
			Sum=firstNum+secondNum;
			System.out.println( +Sum);
			firstNum=secondNum;
			secondNum=Sum;	
		}
	}
		
		public static void main(String[] args)
		{
			FibonacciSeries.fibonacci(10);
		}
	

}
