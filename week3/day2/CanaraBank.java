package week3.day2;

public abstract class CanaraBank implements Payment {
	
    public void cashOnDelivery() {
    	System.out.println("CASH ON DELIVERY");
    	
    }
	
	public void upiPayments() {
    	System.out.println("UPI PAYMENTS");
		
	}
	
	public void cardPayments() {
    	System.out.println("CARD PAYMENTS");
		
	}
	
	public void internetBanking() {
    	System.out.println("INTERNET BANKING");
	}
	
	public void recordPaymentDetails() {
		
		System.out.println("RECORD PAYMENT");

	}

}
