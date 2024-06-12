package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sivaguru");
		driver.findElement(By.xpath("//input[contains(@id,'ss')]")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		
		String loginFailed = "Log in to Facebook" ;
		
		
		if (title.contains("Facebook")) {
			
			System.out.println("Login unsucessfull");
			
		} 
		
		driver.close();

	

	}

}
