package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookList {

	public static void main(String[] args) {
		
		//open chrome broswer
		ChromeDriver driver = new ChromeDriver();
		// maximize window size
		driver.manage().window().maximize();
		// open the facbook url
		driver.get("https://en-gb.facebook.com/");
		
		List<WebElement> fbList = driver.findElements(By.tagName("a"));
		int length = fbList.size();
		System.out.println(length);
		
		for (int i = 0; i < fbList.size(); i++) {
			
			String listname = fbList.get(i).getText();
			
			System.out.println(listname);
			
			
		}
		
		
		
	}

}
