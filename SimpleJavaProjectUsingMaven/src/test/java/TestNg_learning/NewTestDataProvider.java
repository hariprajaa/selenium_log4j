package TestNg_learning;

import org.testng.annotations.Test;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class NewTestDataProvider {
  
  private static final Logger logger = LogManager.getLogger(NewTestDataProvider.class);
  @Test(dataProvider = "dp")
  public void verify(String name, String password) {

      logger.info("Testing started");

      WebDriver driver = new ChromeDriver();
      
      //implicit waits
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      
      driver.manage().window().maximize();
      driver.get("https://www.google.com/");
      
      logger.info("Opened Google successfully");

      WebElement element = driver.findElement(By.id("APjFqb"));
      element.sendKeys("mail login in" + Keys.ENTER);
      logger.debug("Performed Google search");

      

      WebElement mail = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/div/div/span/a/h3"));
      mail.click();
      logger.info("Clicked on Gmail login link");

      WebElement signin = driver.findElement(By.linkText("Sign in"));
      signin.click();
      logger.info("Clicked on Sign in link");

      WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
      email.sendKeys(name, Keys.ENTER); //data driven 
      logger.info("Entered email address");

      WebElement pass= driver.findElement(By.xpath("//input[@type='password']"));
      pass.sendKeys(password, Keys.ENTER); //data driven
      logger.info("Entered password");

      driver.quit();
      logger.info("Browser closed successfully. Test finished.");
  }

  @DataProvider
  public Object[][] dp() { //return type as object of array 
    return new Object[][] {
      new Object[] { "hariprajaa05@gmail.com", "shreshta" },//valid
      new Object[] { "hariprajaa05@gmail.com", "b" },//valid username wrong pass
      new Object[] { "b@gmail.com", "shreshta" },//invalid username correct password
    };
  }
}
