package week1.assignments;

import java.util.Arrays;

public class SecondLargest {

	public static void printSecondLargest(int value[]) 
	{
		Arrays.sort(value);
		System.out.println("The Second Largest is:\t" +value[value.length-2]);
	}
	public static void main(String[] args)
	{
		int value[]= {30,60,90,120};
		SecondLargest.printSecondLargest(value);
	}
}
