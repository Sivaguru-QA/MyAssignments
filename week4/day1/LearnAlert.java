package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("SIVA GURUNATHAN");
		alert.dismiss();
		String text = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text);
		String s = "User cancelled the prompt.";
		if ( text.equals(s)) {
			System.out.println("s");
		} else {
			System.out.println("n");

		}
		driver.close();
	}

}
