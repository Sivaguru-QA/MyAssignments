package assignmentWeek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Sivagurunathan");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		driver.findElement(By.xpath("//input[@id='numberEmployees']")).sendKeys("08");
		driver.findElement(By.id("officeSiteName")).sendKeys("siva.org");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		if (title.contains("Account")) {
			
			System.out.println("ACCOUNT CREATED SUCCESSFULLY");
			
		}
		
		driver.close();
		
		
		
		
		

	}

}
