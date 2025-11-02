package TestNg_learning;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

//ITestListener class in TetstNg
public class ITestListenerClass implements ITestListener {

    ExtentReports extent;
    ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
        // Path for saving HTML report
        String reportPath = System.getProperty("user.dir") + "/reports/extentReport.html";

        // Create and configure the reporter
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        spark.config().setDocumentTitle("Automation Test Report");
        spark.config().setReportName("Login Test Execution Report");
        spark.config().setTheme(com.aventstack.extentreports.reporter.configuration.Theme.DARK);

        // Attach reporter to extent
        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Tester", "Hariprajaa");
        extent.setSystemInfo("Environment", "QA");
    }

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
        test.info("🚀 Test Started: " + result.getName());
        System.out.println("🚀 Test Started: " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("✅ Test Passed: " + result.getName());
        System.out.println("✅ Test Passed: " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.fail("❌ Test Failed: " + result.getName());
        test.fail(result.getThrowable()); // show the actual failure reason
        System.out.println("❌ Test Failed: " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.skip("⚠️ Test Skipped: " + result.getName());
        System.out.println("⚠️ Test Skipped: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush(); // writes everything to HTML
        System.out.println("📄 Report generated successfully!");
    }
}
