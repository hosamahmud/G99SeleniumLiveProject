package verifytheLoginSectionTesCases;

import Data.LoadProperties;
import Driver.DriverSetup;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import verifytheinvalidusernamepasswordTestCase4.VerifyInvalidUsernameUsernamePasswordTestCase4Helper;

public class VerifyTheInvalidUsernamePasswordTestCase4 {

    String URL = LoadProperties.useData.getProperty("GuruURL");
    String browser = LoadProperties.useData.getProperty("Browser");
    VerifyInvalidUsernameUsernamePasswordTestCase4Helper verifyinvalidusernamepasswordTestCase4Helper = null;
    WebDriver driver = null;


    @BeforeTest()
    void initiate() {
        DriverSetup.driverConf(browser);
        driver = DriverSetup.getDriver();
        driver.manage().window().maximize();
        verifyinvalidusernamepasswordTestCase4Helper = new VerifyInvalidUsernameUsernamePasswordTestCase4Helper(driver);
    }

    @Test(priority = 1)
    void verifyTheInvalidPassword() {
        CommonHelper.openWebPage(URL, driver);
        verifyinvalidusernamepasswordTestCase4Helper.verifyGuruBankHomePage(driver);
        verifyinvalidusernamepasswordTestCase4Helper.typeMyUsername(driver);
        verifyinvalidusernamepasswordTestCase4Helper.typeMyPassword(driver);
        verifyinvalidusernamepasswordTestCase4Helper.clickLogin(driver);
        String message = verifyinvalidusernamepasswordTestCase4Helper.displayInvalid(driver);
        System.out.println("A pop Up :" + message);


    }

    @AfterTest()


    void closure() {
        driver.close();
    }

}
