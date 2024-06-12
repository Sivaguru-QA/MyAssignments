package week3.day1;

public class Chrome extends Browser{
	public void openIncognito() {
		// TODO Auto-generated method stub
		System.out.println("OPENED INCOGNITO MODE");

	}
	public void clearCache() {
		// TODO Auto-generated method stub
		System.out.println("CLEARED CACHE ");

	}
	public static void main(String[] args) {
		Chrome c = new Chrome();
		c.openURL();
		c.closeBrowser();
		c.navigateBack();
	
	}

}
