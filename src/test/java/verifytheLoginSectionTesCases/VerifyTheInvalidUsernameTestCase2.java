package verifytheLoginSectionTesCases;

import Data.LoadProperties;
import Driver.DriverSetup;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import verifytheinvalidusernameTestCase2.VerifyInvalidUsernameTestCase2Helper;

public class VerifyTheInvalidUsernameTestCase2 {

    String URL = LoadProperties.useData.getProperty("GuruURL");
    String browser = LoadProperties.useData.getProperty("Browser");
    VerifyInvalidUsernameTestCase2Helper verifyinvalidusernameTestCase2Helper = null;
    WebDriver driver = null;


    @BeforeTest()
    void initiate() {
        DriverSetup.driverConf(browser);
        driver = DriverSetup.getDriver();
        driver.manage().window().maximize();
        verifyinvalidusernameTestCase2Helper = new VerifyInvalidUsernameTestCase2Helper(driver);
    }

    @Test(priority = 1)
    void verifyTheInvalidUsername() {
        CommonHelper.openWebPage(URL, driver);
        verifyinvalidusernameTestCase2Helper.verifyGuruBankHomePage(driver);
        verifyinvalidusernameTestCase2Helper.typeMyUsername(driver);
        verifyinvalidusernameTestCase2Helper.typeMyPassword(driver);
        verifyinvalidusernameTestCase2Helper.clickLogin(driver);
        String message = verifyinvalidusernameTestCase2Helper.displayInvalid(driver);
        System.out.println("A pop Up " + message);


    }

    @AfterTest()


    void closure() {
        driver.close();
    }

}
