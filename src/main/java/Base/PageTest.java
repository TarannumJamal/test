package Base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class PageTest {

    public static WebDriver driver;
    public static ExtentReports report;
    public static ExtentTest logger;

@BeforeSuite
    public static void ChromeDriverInitialization()
    {
        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

@AfterMethod
    public void afterMethod()
    {
    driver.quit();
    }

@BeforeClass
    public static void startTest()
    {
        report = new ExtentReports("./Execution Reports/ExtentReport"+ System.currentTimeMillis()+".html", false);
        logger = report.startTest("Extent Report");
    }

@AfterClass
    public void endTest()
    {
    report.endTest(logger);
    report.flush();
    }
}
