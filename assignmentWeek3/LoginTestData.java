package assignmentWeek3;

public class LoginTestData extends TestData{
	
	public void enterUsername() {
		System.out.println("print enter username");
	}
	public void enterPassword() {
		System.out.println("print enter password");
	}

	public static void main(String[] args) {
		
		LoginTestData el = new LoginTestData();
		el.enterCredentials();
		el.navigateToHomePage();
		el.enterUsername();
		el.enterPassword();
	}
}
