package selenium_learn;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enter_data {

public static void main(String[] args)throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/text_box_testing_with_selenium.html");
		
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//enter in textbox
		WebElement textbox = driver.findElement(By.id("emailInput"));
		textbox.sendKeys("This is an appended text through selenium"); //clearer than this method :driver.findElement(By.id("emailInput")).sendKeys("This is appened through selenium");
		

		Thread.sleep(2000);
		
		//appending using xpath select an element and right click select copy xpath
		//does'nt overwrite only appends..if u wanna overwrite then first clear then write 
		
		WebElement append = driver.findElement(By.xpath("//*[@id=\"appendInput\"]"));
		append.sendKeys("appened text from selenium");
		
		Thread.sleep(2000);
		
		//retrive value from text box and print in console
		
		WebElement retrieve = driver.findElement(By.id("defaultInput"));
		String value_of_string = retrieve.getAttribute("value");
		System.out.println(value_of_string);
		
		Thread.sleep(2000);
		
		//clearing the value in textbox
		WebElement clear_textbox = driver.findElement(By.id("clearInput"));
		clear_textbox.clear();
		
		//checking if textbox is enabled or disabled
		
		WebElement checking_enabled =  driver.findElement(By.id("disabledInput"));
		boolean check = checking_enabled.isEnabled();
		System.out.println(check);
		

	}

}

/** normal method : 
 * Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//enter in textbox
		driver.findElement(By.id("emailInput")).sendKeys("This is appened through selenium");
		Thread.sleep(2000);
		
		//appending using xpath select an element and right click select copy xpath
		driver.findElement(By.xpath("//*[@id=\"appendInput\"]")).sendKeys("appened text from selenium");
		
		Thread.sleep(2000);
		//retrive value from text box and print in console
		
		String value_in_text_box=driver.findElement(By.id("defaultInput")).getAttribute("value");
		System.out.print(value_in_text_box);
		
		Thread.sleep(2000);
		//clearing the value in textbox
		
		driver.findElement(By.id("clearInput")).clear();
**/
