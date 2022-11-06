package week1.day1;

public class Task2Mobile {
	String mobileBrandname = "Apple";
	char mobileLogo = 'I';
	short noOfMobilePiece = 5;
	int modelNumber = 14;
	long mobileImeiNumber = 4567321;
	float mobilePrice = 800f;
	boolean isDamaged = true;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mobile.myApple = new Task2Mobile();
		
		System.out.println(mobileBrandname);
		System.out.println(mobileLogo);
		System.out.println(noOfMobilePiece);
		System.out.println(modelNumber);
		System.out.println(mobileImeiNumber);
		System.out.println(mobilePrice);
		System.out.println(isDamaged);
		
	}

}
