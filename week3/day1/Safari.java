package week3.day1;

public class Safari extends Browser{
	public void readerMode() {
		// TODO Auto-generated method stub
		System.out.println("OPENED READERMODE");

	}
	public void fullScreenMode() {
		// TODO Auto-generated method stub
		System.out.println("OPENED FULLSCREENMODE");

	}
	public static void main(String[] args) {
		Safari s = new Safari();
		s.openURL();
		s.closeBrowser();
		s.navigateBack();
	}

}
