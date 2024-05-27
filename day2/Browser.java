package week1.day2;

public class Browser {

	public String launchBrowser(String browserName)
	{
		System.out.println("Browser launched successfully");
		return browserName;
		
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Broswer chrome = new Browser();
		String launchBrowser = chrome.launchBrowser("GOOGLE CHROME");
		System.out.println(launchBrowser);
		chrome.loadUrl();

	}

}
