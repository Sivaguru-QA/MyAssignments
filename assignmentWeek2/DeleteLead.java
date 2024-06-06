package assignmentWeek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open chrome broswer
		ChromeDriver driver = new ChromeDriver();
		// maximize window size
		driver.manage().window().maximize();
		// open the leaftap url
		driver.get("http://leaftaps.com/opentaps/");
		//used to wait for element until its enable to perform action
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// enter username and password 
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		// click on submit to login
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		// click on CRM/SFA
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		//Click the "Leads" link.
		driver.findElement(By.linkText("Leads")).click();
		//Click Find leads
		driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
		//Click on the "Phone" tab
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter the phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9988776655");
		// Click the "Find leads" button
		driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
		//Capture the lead ID of the first resulting lead.
        WebElement firstlead = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
        String leadID = firstlead.getText();
        System.out.println(leadID);
        
        //Click the first resulting lead
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement fl = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@class='linktext'])[4]")));
        fl.click();
        
        //Click the first resulting lead
        //firstlead.click();
        //Click the "Delete" button
        driver.findElement(By.className("subMenuButtonDangerous")).click();
        // Click "Find leads" again
        driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
        //Enter the captured lead ID
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
        // Click the "Find leads" button
        driver.findElement(By.xpath("//button[contains(text(),'Find')]")).click();
        //Verify the presence of the message "No records to display" in the Lead List. This message confirms the successful deletion.
        WebElement noRecordsMessage = driver.findElement(By.xpath("//div[@class='x-paging-info']"));
        
        if (noRecordsMessage.getText().equals("No records to display")) {
            System.out.println("Lead deletion successful.");
        } else {
            System.out.println("Lead deletion failed.");
        }
        //Close the browser
        driver.close();   
        
				

	}

}
