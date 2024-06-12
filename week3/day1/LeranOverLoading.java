package week3.day1;

public class LeranOverLoading {
	
	public void reportStep(String msg, String status) {
		System.out.println("Message: " + msg);
		System.out.println("Status is: " + status);	
		
	}
	public void reportStep(String msg, String status, boolean snap) {
		System.out.println("Message: " + msg);	
		System.out.println("Status is: " + status);
		System.out.println("Snap : " + snap);	
    }
	public static void main(String[] args) {
		LeranOverLoading ol = new LeranOverLoading();
		ol.reportStep("reported", "passed");
		ol.reportStep("Login", "Passed", true);
		
	}

}
