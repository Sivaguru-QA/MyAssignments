package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("siva");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("gurunathan");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("avis.org");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("AVIS");
		driver.findElement(By.name("submitButton")).click();
		
        String title = driver.getTitle();
		
		System.out.println(title);
		
		
		if (title.contains("Lead")) {
			
			System.out.println("LEAD CREATED SUCCESSFULLY");
			
		}
		
		driver.close();
	}

}
