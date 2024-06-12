package week3.day1;

public class Edge extends Browser {
	
	public void takeSnap() {
		// TODO Auto-generated method stub
		System.out.println("TAKEN SNAP");

	}
	public void clearCookies() {
		// TODO Auto-generated method stub
		System.out.println("CLEARED COOKIES");

	}
	public static void main(String[] args) {
		Edge e = new Edge();
		e.openURL();
		e.closeBrowser();
		e.navigateBack();
	}

}
