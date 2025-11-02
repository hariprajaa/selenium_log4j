package TestNg_learning;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.Assert;


@Listeners(TestNg_learning.ITestListenerClass.class)
//listener (package name . file name where the iTestLIstener is present)
public class LoginITestListener {
	 	@Test(priority=1)
	    public void loginSuccess() {
	        System.out.println("Running loginSuccess test...");
	        Assert.assertTrue(true);
	    }

	    @Test(priority=2)
	    public void loginFail() {
	        System.out.println("Running loginFail test...");
	        Assert.assertTrue(false);
	    }
}
