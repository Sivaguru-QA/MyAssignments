package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FbCreateAcc {

	public static void main(String[] args) {
		//open chrome broswer
		ChromeDriver driver = new ChromeDriver();
		// maximize window size
		driver.manage().window().maximize();
		// open the facbook url
		driver.get("https://en-gb.facebook.com/");
		//used to wait for element until its enable to perform action
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// click on create account tab
		driver.findElement(By.xpath("(//a[contains(text(),'Create')]) [1]")).click();
		// enter firstname and lastnamein create acc page
		driver.findElement(By.name("firstname")).sendKeys("siva");
		driver.findElement(By.name("lastname")).sendKeys("avis");
		// using select option dropdown is date of birth
		WebElement date = driver.findElement(By.id("day"));
		Select optionDate = new Select(date);
		optionDate.selectByValue("7");
		
		WebElement month = driver.findElement(By.id("month"));
		Select optionMonth = new Select(month);
		optionMonth.selectByValue("7");
		
		WebElement year = driver.findElement(By.id("year"));
		Select optionYear = new Select(year);
		optionYear.selectByVisibleText("1995");
		// gender has the select from radio button
		driver.findElement(By.xpath("//label[text()='Male']/following-sibling::input")).click();
		// enter email/phone num and password 
		driver.findElement(By.name("reg_email__")).sendKeys("siva@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("siva@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Qwert@123");
		// click on sign up button
		driver.findElement(By.name("websubmit")).click();
		
		
		
		
		
		
		
		
		
	}

}
