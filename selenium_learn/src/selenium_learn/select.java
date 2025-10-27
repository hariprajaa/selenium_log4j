package selenium_learn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class select {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/buttona.html");
		driver.manage().window().maximize();
		
		//Selecting a drop down using idex,value,visible text
		
		WebElement dropdownbox = driver.findElement(By.id("toolSelect"));
		Select select = new Select(dropdownbox);
		
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByValue("jmeter");
		Thread.sleep(2000);
		select.selectByVisibleText("Rest Assured");
		
		Thread.sleep(2000);
		//search by putting value in dropdown 
		dropdownbox.sendKeys("jmeter");
	}

}
