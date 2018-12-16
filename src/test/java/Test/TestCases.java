package Test;

import Base.PageTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestCases extends PageTest {


    @Test
    public void openGoogle() {
        String testCaseName = "TC01_OpenGoogle";
        try
        {
        logger.log(LogStatus.INFO,"Executing test case" +testCaseName);
        driver.get("http://www.google.com");
        logger.log(LogStatus.PASS,"Opened google successfully");
        }
        catch (Exception e)
        {
            System.out.println("Failed test");
            logger.log(LogStatus.FAIL,"Failed to open google successfully");
        }
    }
}
