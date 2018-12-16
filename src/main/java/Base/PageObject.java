package Base;

import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Base.PageTest.logger;

public class PageObject {

    public void elementClick(WebElement element) {
        try {
            element.click();
            logger.log(LogStatus.PASS, "Clicked on element successfully");
        } catch (Exception e) {
            Assert.fail();
            logger.log(LogStatus.FAIL, "Error to click on element" + e.getStackTrace());
        }
    }

    public void selectByIndex(WebElement element)
    {

    }
}

