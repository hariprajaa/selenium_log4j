package selenium_learn;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        
        driver.manage().window().maximize() ;       // Search for "amazon"
        driver.findElement(By.className("gLFyf")).sendKeys("amazon", Keys.ENTER);

        Thread.sleep(20000);
        
        driver.findElement(By.partialLinkText("Shop online at Amazon India")).click();
        
        // or driver.findElement(By.xpath("//a[@class='sVXRqc']")).click();

	}

}
