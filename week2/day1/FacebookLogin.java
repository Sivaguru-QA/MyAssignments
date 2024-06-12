package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sivaguru1208@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("qwert1234");
		driver.findElement(By.name("login")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String loginFailed = "Log in to Facebook" ;
		
		
		if (title.contains("Log")) {
			
			System.out.println("Login unsucessfull");
			
		} 
		
		driver.close();

	}

}
