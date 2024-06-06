package assignmentWeek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditLead {

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
		//  Enter the CompanyName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("EXELA");
		// Enter the FirstName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("SIVA");
		//Enter the LastName Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("GURUNATHAN");
		//Enter the FirstName (Local) Field Using Xpath
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Sivaguru");
		// Enter the Department Field 
		driver.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("IT");
		//Enter the Description Field 
		WebElement desc = driver.findElement(By.xpath("//textarea[@name='description']"));
		desc.sendKeys("Myself Sivagurunathan");
		//Enter your email in the E-mail address Field
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("siva4321@gmail.com");
		//Select State/Province as NewYork Using Visible Text
		WebElement statedd = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));
		Select options = new Select(statedd);
		options.selectByVisibleText("New York");
		//Click on the Create Button
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		// Explicit wait for the edit button to be clickable
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement editButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Edit']")));
        editButton.click();

        // Re-locate and clear the Description Field to avoid StaleElementReferenceException
        WebElement newDesc = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//textarea[@name='description']")));
        newDesc.clear();

        // Fill the Important Note Field
        driver.findElement(By.xpath("//textarea[@name='importantNote']")).sendKeys("QA Automation");
        // Click on the update button
        driver.findElement(By.xpath("//input[@value='Update']")).click();

        // Get the Title of the Resulting Page
        String title = driver.getTitle();
        System.out.println(title);

        // Close the browser window
        driver.close();
    }
}