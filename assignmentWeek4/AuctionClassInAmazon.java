package assignmentWeek4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class AuctionClassInAmazon {

	public static void main(String[] args) throws IOException, InterruptedException {
		//Initialize ChromeDrive
		        ChromeOptions options=new ChromeOptions();
		        options.addArguments("--disable-notifications");
		        ChromeDriver driver=new ChromeDriver(options);
				driver.manage().window().maximize();   //maximize window
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   // wait for element 
				// load url
				driver.get("https://www.amazon.in/");
				//Search for "oneplus 9 pro".
				driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
				driver.findElement(By.id("nav-search-submit-button")).click();
				//Get the price of the first product.
				String price = driver.findElement(By.xpath("//span[@class='a-price']")).getText();
				System.out.println(price);
				//Print the number of customer ratings for the first displayed product
				String rating = driver.findElement(By.xpath("(//div[@class='a-row a-size-small'])//span[2]")).getText();
				System.out.println(rating);
				//Click the first text link of the first image.
				
				Actions act = new Actions(driver); 
				WebElement mouseOver =driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
				act.moveToElement(mouseOver).perform();
				driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
				
				Set<String> windowHandles = driver.getWindowHandles();
				System.out.println(windowHandles);

				List<String> windows=new ArrayList<String>(windowHandles);

				driver.switchTo().window(windows.get(1));
				Thread.sleep(3000);
				//Take a screenshot of the product displayed.
				File scr = driver.getScreenshotAs(OutputType.FILE);
				File trg = new File("./snap/img.png");
				FileUtils.copyFile(scr, trg);
				// Click the 'Add to Cart' button
				driver.findElement(By.id("add-to-cart-button")).click();
				//Get the cart subtotal and verify if it is correct.
				String subTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
				System.out.println(subTotal);
				
				if (price.equals(subTotal)) {
					System.out.println("pass");
					
				} else {
					System.out.println("fail");
				}			
				

	}

}
