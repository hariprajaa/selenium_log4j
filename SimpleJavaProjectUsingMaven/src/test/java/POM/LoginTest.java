package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	@BeforeTest
	void setup() {
		driver = new ChromeDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?continue=http%3A%2F%2Fsupport.google.com%2Fmail%2Fanswer%2F56256%3Fhl%3Den&dsh=S-1642677794%3A1761901115391939&ec=GAZAdQ&hl=en&ifkv=ARESoU3MBZhV2ZHZk9rD8qloZU9kB_BSFcYGVrLVGNsTQ-LBG0uuW4B1ooQmdh7qMk0OroZ1EowVUg&passive=true&sjid=6638630241567882246-NC&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	@Test
	void testlogin() {
		LoginPage lp = new LoginPage(driver);
		lp.SetUserName("hariprajaa@gmail.com");
		lp.setUserPassword("password123");
	}

}
