package TestNg_learning;

import org.testng.annotations.Test;

public class GroupTest {
		//check the Grouptestng.xml file to run the group you need mention it inside the <include name> inside the name field. 
	    @Test(groups="runfirst")
	    public void beforeClass() {
	        System.out.println(">>> @BeforeClass - Executes before the first @Test method in the current class");
	    }
	    
	    @Test(groups="runfirst")
	    public void beforeTest() {
	        System.out.println(">>> @BeforeTest - Executes before all tests in the <test> tag of testng.xml");
	    }

	    @Test(groups="runsecond")
	    public void beforeMethod() {
	        System.out.println(">>> @BeforeMethod - Executes before each @Test method");
	    }

	    @Test(groups="runsecond")
	    public void test1() {
	        System.out.println(">>> @Test - test1() is running");
	    }

	    @Test(groups="runfirst")
	    public void test2() {
	        System.out.println(">>> @Test - test2() is running");
	        
	    }
}
