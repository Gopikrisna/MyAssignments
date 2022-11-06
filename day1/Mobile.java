package week1.day1;

public class Mobile {
	
	public void makeCall() {
		// TODO Auto-generated method stub
		
		System.out.println("Call waiting");

	}
	
	public void sendMsg() {
		// TODO Auto-generated method stub

		System.out.println("Sending success");
	}
	
	public static void main(String[] args) {
		
		Mobile Apple = new Mobile();
		Apple.makeCall();
		Apple.sendMsg();
	}

}
