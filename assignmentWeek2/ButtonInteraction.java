package assignmentWeek2;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {

	public static void main(String[] args) {
		//open chrome broswer
		ChromeDriver driver = new ChromeDriver();
		// maximize window size
		driver.manage().window().maximize();
		// open the leaftap url
		driver.get("https://leafground.com/button.xhtml");
		//used to wait for element until its enable to perform action
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the button with the text ‘Click and Confirm title.’
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		// Verify that the title of the page is ‘dashboard’
		String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Title verification passed.");
        } else {
            System.out.println("Title verification failed.");
        }
        // navigate to previous screen
        driver.navigate().back();
        
        // Check if the button with the text ‘Confirm if the button is disabled’ is disabled.
        WebElement disabledButton = driver.findElement(By.xpath("//span[text()='Disabled']"));
        boolean isDisabled = !disabledButton.isEnabled();
        System.out.println("Button 'Confirm if the button is disabled' is disabled: " + isDisabled);

        // Find and print the position of the button with the text ‘Submit.’
        WebElement submitButton = driver.findElement(By.xpath("//span[contains(text(), 'Submit')]"));
        int submitButtonX = submitButton.getLocation().getX();
        int submitButtonY = submitButton.getLocation().getY();
        System.out.println("Position of 'Submit' button: (" + submitButtonX + ", " + submitButtonY + ")");

        // Find and print the background color of the button with the text ‘Find the Save button color.’
        WebElement saveButton = driver.findElement(By.xpath("//span[contains(text(), 'Save')]"));
        String saveButtonColor = saveButton.getCssValue("background-color");
        System.out.println("Background color of 'Find the Save button color' button: " + saveButtonColor);

        // Find and print the height and width of the button with the text ‘Find the height and width of this button.’
        WebElement heightWidthButton = driver.findElement(By.xpath("(//span[contains(text(), 'Submit')])[2]"));
        int buttonHeight = heightWidthButton.getSize().getHeight();
        int buttonWidth = heightWidthButton.getSize().getWidth();
        System.out.println("Height of 'Find the height and width of this button' button: " + buttonHeight);
        System.out.println("Width of 'Find the height and width of this button' button: " + buttonWidth);
     
        // Close the browser window
        driver.quit();
          
		
	}

}
