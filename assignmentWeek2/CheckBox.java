package assignmentWeek2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		
		//open chrome broswer
		ChromeDriver driver = new ChromeDriver();
		// maximize window size
		driver.manage().window().maximize();
		// open the leafground url
		driver.get("https://leafground.com/checkbox.xhtml");
		//used to wait for element until its enable to perform action
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Click on the "Basic Checkbox”
		driver.findElement(By.xpath("//span[text()='Basic']/parent::div")).click();
		//Click on the "Notification Checkbox."
		driver.findElement(By.xpath("//span[text()='Ajax']/parent::div")).click();
		// Verify that the expected message is displayed
        WebElement notificationMessage = driver.findElement(By.xpath("//div[contains(@class, 'ui-growl-item-container')]"));
        if (notificationMessage.isDisplayed()) {
            System.out.println("Notification message is displayed.");
        } else {
            System.out.println("Notification message is not displayed.");
        }

        // Click on your favorite language (assuming it's related to checkboxes)
        WebElement favoriteLanguageCheckbox = driver.findElement(By.xpath("//label[text()='Java']"));
        favoriteLanguageCheckbox.click();

        // Click on the "Tri-State Checkbox."
        WebElement triStateCheckbox = driver.findElement(By.xpath("//div[@id='j_idt87:ajaxTriState']/div[2]"));
        triStateCheckbox.click();

        // Verify which tri-state option has been chosen
        String triStateValue = triStateCheckbox.getAttribute("aria-checked");
        System.out.println("Tri-State Checkbox value: " + triStateValue);

        // Click on the "Toggle Switch."
        WebElement toggleSwitch = driver.findElement(By.xpath("//div[contains(@class, 'ui-toggleswitch-slider')]"));
        toggleSwitch.click();

        // Verify that the expected message is displayed
        WebElement toggleMessage = driver.findElement(By.xpath("//div[contains(@class, 'ui-growl-item-container')]"));
        if (toggleMessage.isDisplayed()) {
            System.out.println("Toggle message is displayed.");
        } else {
            System.out.println("Toggle message is not displayed.");
        }

        // Verify if the Checkbox is disabled
        WebElement disabledCheckbox = driver.findElement(By.xpath("//span[text()='Disabled']"));
        if (disabledCheckbox.getAttribute("class").contains("ui-state-disabled")) {
            System.out.println("Checkbox is disabled.");
        } else {
            System.out.println("Checkbox is not disabled.");
        }
        
     // Select multiple options on the page
        driver.findElement(By.xpath("//div[@role='combobox']")).click();
        
        

        

	}

}
