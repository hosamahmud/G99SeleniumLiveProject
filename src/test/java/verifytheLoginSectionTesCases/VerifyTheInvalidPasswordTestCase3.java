package verifytheLoginSectionTesCases;

import Data.LoadProperties;
import Driver.DriverSetup;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import verifytheinvalidpassTestCase3.VerifyInvalidPassTestCase3Helper;

public class VerifyTheInvalidPasswordTestCase3 {

    String URL = LoadProperties.useData.getProperty("GuruURL");
    String browser = LoadProperties.useData.getProperty("Browser");
    VerifyInvalidPassTestCase3Helper verifyinvalidpasswordTestCase3Helper = null;
    WebDriver driver = null;


    @BeforeTest()
    void initiate() {
        DriverSetup.driverConf(browser);
        driver = DriverSetup.getDriver();
        driver.manage().window().maximize();
        verifyinvalidpasswordTestCase3Helper = new VerifyInvalidPassTestCase3Helper(driver);
    }

    @Test(priority = 1)
    void verifyTheInvalidPassword() {
        CommonHelper.openWebPage(URL, driver);
        verifyinvalidpasswordTestCase3Helper.verifyGuruBankHomePage(driver);
        verifyinvalidpasswordTestCase3Helper.typeMyUsername(driver);
        verifyinvalidpasswordTestCase3Helper.typeMyPassword(driver);
        verifyinvalidpasswordTestCase3Helper.clickLogin(driver);
        String message = verifyinvalidpasswordTestCase3Helper.displayInvalid(driver);
        System.out.println("A pop Up :" + message);


    }

    @AfterTest()


    void closure() {
        driver.close();
    }

}
