package selenium_learn;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gmail_validation {

    // Correct Log4j 2 style logger
    private static final Logger logger = LogManager.getLogger(gmail_validation.class);

    public static void main(String[] args) throws InterruptedException {

        logger.info("Testing started");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        
        logger.info("Opened Google successfully");

        WebElement element = driver.findElement(By.id("APjFqb"));
        element.sendKeys("mail login in" + Keys.ENTER);
        logger.debug("Performed Google search");

        Thread.sleep(3000);

        WebElement mail = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/span/a/h3"));
        mail.click();
        logger.info("Clicked on Gmail login link");

        WebElement signin = driver.findElement(By.linkText("Sign in"));
        signin.click();
        logger.info("Clicked on Sign in link");

        Thread.sleep(3000);

        WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
        email.sendKeys("hariprajaa@finestcoder.com", Keys.ENTER);
        logger.info("Entered email address");

        Thread.sleep(3000);

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("shreshta13", Keys.ENTER);
        logger.info("Entered password");

        Thread.sleep(2000);
        driver.quit();
        logger.info("Browser closed successfully. Test finished.");
    }
}
