package selenium_learn;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class alert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/alertbox.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//clicking okay in alert box
		
		WebElement button1 = driver.findElement(By.xpath("/html/body/button[1]"));
		button1.click();
		Thread.sleep(2000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		Thread.sleep(2000);
		
		//clicking close 
		
		WebElement button2 = driver.findElement(By.xpath("/html/body/button[2]"));
		button2.click();
		
		Alert alert2 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert2.dismiss();
		Thread.sleep(2000);
		alert2.accept();
		
		//wrting in the field of alert 
		WebElement button3 = driver.findElement(By.xpath("/html/body/button[3]"));
		button3.click();
		Thread.sleep(2000);
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("I love testing");
		Thread.sleep(2000);
		alert3.accept();
		Thread.sleep(2000);
		alert3.accept();
		
	}


}
