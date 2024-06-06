package assignmentWeek2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RadioButton {

    public static void main(String[] args) {
		//open chrome broswer
		ChromeDriver driver = new ChromeDriver();
		// maximize window size
		driver.manage().window().maximize();

        // Add Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Launch the Browser and Load the URL
        driver.get("https://www.leafground.com/radio.xhtml");

        // Select 'Your most favourite browser' from the radio buttons
        driver.findElement(By.xpath("//label[text()='Chrome']")).click();

        // Click on a radio button, then click on the same radio button again to verify that it becomes ‘unselected’.
        WebElement chennai = driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div"));
        chennai.click();
        chennai.click();

       

        // Check and select the age group (21-40 Years) if not already selected
        WebElement ageRadioButton = driver.findElement(By.xpath("//label[text()='21-40 Years']/preceding-sibling::div[contains(@class, 'ui-radiobutton-box')]"));
        if (!ageRadioButton.getAttribute("class").contains("ui-state-active")) {
            ageRadioButton.click();
        }

        // Close the browser
        driver.quit();
    }
}

