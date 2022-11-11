package week1.assignments;

public class FindIntersection {

	public static void intersection(int firstArray[],int secondArray[]) 
	{
		for (int i=0; i<firstArray.length;i++)
		{
			for (int j=0; j<secondArray.length;j++)
			{
				if (firstArray[i]==secondArray[j])
				{
					System.out.println("Intersection of the values is:\t"+firstArray[i]);
				}
			}
		}
	}
	
	public static void main(String[] args)
	{
		int firstArray[]= {3,12,20,33,45,58,61};
		int secondArray[]= {1,3,6,11,24,32,46,54,68,79,83,99};
		
		FindIntersection searchintersection = new FindIntersection();
		searchintersection.intersection(firstArray, secondArray);
	}
	

}
