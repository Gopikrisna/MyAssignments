package week1.day1;

public class Task1TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chasssisNumber = 559282L;
	boolean isPunchered = false;
	String bikeName = "Honda CBR";
	double runningKM = 700;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Task1TwoWheeler Honda = new Task1TwoWheeler();
		
		System.out.println(Honda.noOfMirrors);
		System.out.println(Honda.chasssisNumber);
		System.out.println(Honda.isPunchered);
		System.out.println(Honda.noOfWheels);
		System.out.println(Honda.bikeName);
		System.out.println(Honda.runningKM);
	
	}
}
