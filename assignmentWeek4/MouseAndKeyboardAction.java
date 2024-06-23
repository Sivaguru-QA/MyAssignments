package assignmentWeek4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboardAction {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
        ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();   //maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   // wait for element 
		// load url
		driver.get("https://www.bigbasket.com/");
		// Click on "Shop by Category"
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		// Mouse over "Foodgrains, Oil & Masala".
		Actions act1 = new Actions(driver);
		WebElement mouseOverFoodgrains = driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		act1.moveToElement(mouseOverFoodgrains).perform();
		//Mouse over "Rice & Rice Products"
		Actions act2 = new Actions(driver);
		WebElement mouseOverToRice = driver.findElement(By.xpath("//a[text()='Rice & Rice Products']"));
		act2.moveToElement(mouseOverToRice).perform();
		// Click on "Boiled & Steam Rice".
		driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();
		//Filter the results by selecting the brand "bb Royal"
		Actions act3 = new Actions(driver);
		WebElement mouseOverToBrand = driver.findElement(By.xpath("//input[@id='i-BBRoyal']"));
		act3.moveToElement(mouseOverToBrand).perform();
		mouseOverToBrand.click();
		Thread.sleep(3000);
		//Click on "Tamil Ponni Boiled Rice"
		driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']")).click();
		//switch to window
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windows=new ArrayList<String>(windowHandles);
		driver.switchTo().window(windows.get(1));
		Thread.sleep(3000);
		//Select the 5 Kg bag.
		Actions act4 = new Actions(driver);
		WebElement mouseOverToFiveKG = driver.findElement(By.xpath("//span[text()='5 kg']"));
		act4.moveToElement(mouseOverToFiveKG).perform();
		mouseOverToFiveKG.click();
		// Check and note the price of the rice.
		
		
		
		

	}

}
