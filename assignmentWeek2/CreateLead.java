package assignmentWeek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		//open chrome broswer
		ChromeDriver driver = new ChromeDriver();
		// maximize window size
		driver.manage().window().maximize();
		// open the leaftap url
		driver.get("http://leaftaps.com/opentaps/");
		//used to wait for element until its enable to perform action
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter the Username as "DemoSalesManager" and the Password as "crmsfa".
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//Click on the Login Button
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		// Click on the CRM/SFA Link
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		//Click on the Leads Button
		driver.findElement(By.linkText("Leads")).click();
		// Click on Create Lead
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
		// enter first name and lastname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("siva");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("gurunathan");
		// enter companyname
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("avis.org");
		// enter title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("AVIS");
		//click create button
		driver.findElement(By.name("submitButton")).click();
		// Get current tile of page and store in title variable
        String title = driver.getTitle();
		// print title 
		System.out.println(title);
		
		//verify title with contains 
		if (title.contains("Lead")) {
			
			System.out.println("LEAD CREATED SUCCESSFULLY");
			
		}
		
		driver.close();
	}

}
