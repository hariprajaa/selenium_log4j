package selenium_learn;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        //Explicit wait 
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
        
        
        driver.manage().window().maximize(); // Search for "amazon"
        //wait for search box
        WebElement open = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("gLFyf")));
        open.sendKeys("amazon", Keys.ENTER);

        Thread.sleep(20000);
        //wait for link text 
        WebElement link_seen = wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Shop online at Amazon India")));
        link_seen.click();
        // or driver.findElement(By.xpath("//a[@class='sVXRqc']")).click();

	}

}
