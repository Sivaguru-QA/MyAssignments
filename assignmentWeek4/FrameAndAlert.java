package assignmentWeek4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import week3.day1.Chrome;

public class FrameAndAlert {

	public static void main(String[] args) {
		
		//Initialize ChromeDrive
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();   //maximize window
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));   // wait for element 
		// load url
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		// switch to frame and  Click the "Try It" button inside the frame
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Click OK/Cancel in the alert that appears
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//Confirm the action is performed correctly by verifying the text displayed
		WebElement actualOutput = driver.findElement(By.xpath("//p[@id='demo']"));
        String actualText = actualOutput.getText();
        System.out.println(actualText);
        String expectedOutput = "Hello Harry Potter! How are you today?";
        
        if (actualText.equals(expectedOutput)) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
		
		
	}

}
