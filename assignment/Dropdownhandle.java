package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownhandle {

	public static void main(String[] args) {

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
		// click on Account
		driver.findElement(By.xpath("//a[contains(text(),'Accounts')]")).click();
		// click on Create account
		driver.findElement(By.partialLinkText("Create")).click();
		// enter value in Accountname and description field
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Sivagurunathan");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		// using select option, selected IND_SOFTWARE value in industry field
		WebElement industryDD = driver.findElement(By.name("industryEnumId"));
		Select optionsIND = new Select(industryDD);
		optionsIND.selectByValue("IND_SOFTWARE");
		// using select option, selected S-Corporation value in ownership field
		WebElement ownershipDD = driver.findElement(By.name("ownershipEnumId"));
		Select optionsOWN = new Select(ownershipDD);
		optionsOWN.selectByVisibleText("S-Corporation");
		// using select option, selected LEAD_EMPLOYEE value in datasource field
		WebElement sourceDD = driver.findElement(By.id("dataSourceId"));
		Select optionsSOU = new Select(sourceDD);
		optionsSOU.selectByValue("LEAD_EMPLOYEE");
		// using select option, selected texas value in state field
		WebElement stateDD = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select optionsSTATE = new Select(stateDD);
		optionsSTATE.selectByValue("TX");
		
		WebElement marketCamDD = driver.findElement(By.id("marketingCampaignId"));
		Select optionsMC= new Select(marketCamDD);
		optionsMC.selectByIndex(6);
		// click submit to create account
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		// get the title of page and store in varibale title
		String title = driver.getTitle();
		// print title
		System.out.println(title);
		// validate the title 
		if (title.contains("Account")) {
			
			System.out.println("SUCCESSFUL");
			
		}
		
		driver.close();
	}

}
