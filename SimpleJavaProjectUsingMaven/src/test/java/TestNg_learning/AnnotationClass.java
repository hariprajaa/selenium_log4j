package TestNg_learning;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationClass {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println(">>> @BeforeSuite - Executes first in the entire suite");
    }

    

    @BeforeClass
    public void beforeClass() {
        System.out.println(">>> @BeforeClass - Executes before the first @Test method in the current class");
    }
    
    @BeforeTest
    public void beforeTest() {
        System.out.println(">>> @BeforeTest - Executes before all tests in the <test> tag of testng.xml");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println(">>> @BeforeMethod - Executes before each @Test method");
    }

    @Test
    public void test1() {
        System.out.println(">>> @Test - test1() is running");
    }

    @Test
    public void test2() {
        System.out.println(">>> @Test - test2() is running");
        
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println(">>> @AfterMethod - Executes after each @Test method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println(">>> @AfterClass - Executes after all @Test methods in this class");
    }

    @AfterTest
    public void afterTest() {
        System.out.println(">>> @AfterTest - Executes after all tests in the <test> tag of testng.xml");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println(">>> @AfterSuite - Executes last after everything in the suite");
    }
}
