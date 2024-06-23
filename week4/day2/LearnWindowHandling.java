package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandling {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/");
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);

		List<String> windows=new ArrayList<String>(windowHandles);

		driver.switchTo().window(windows.get(1));
		String childTitle = driver.getTitle();
		System.out.println(childTitle);
		
		driver.switchTo().window(windows.get(0));
		String parentTitle = driver.getTitle();
		System.out.println(parentTitle);
		
		driver.close();
		
	}

}
