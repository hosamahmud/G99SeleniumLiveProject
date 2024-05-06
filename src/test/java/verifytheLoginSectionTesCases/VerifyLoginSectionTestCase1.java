package verifytheLoginSectionTesCases;

import Data.LoadProperties;
import Driver.DriverSetup;
import verifytheloginsectionTestCase1.VerifyLoginSectionTestCase1Helper;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyLoginSectionTestCase1 {

    String URL = LoadProperties.useData.getProperty("GuruURL");
    String browser = LoadProperties.useData.getProperty("Browser");
    VerifyLoginSectionTestCase1Helper verifyloginsectionTestCase1Helper = null;
    WebDriver driver = null;


    @BeforeTest()
    void initiate() {
        DriverSetup.driverConf(browser);
        driver = DriverSetup.getDriver();
        driver.manage().window().maximize();
        verifyloginsectionTestCase1Helper = new VerifyLoginSectionTestCase1Helper(driver);
    }

    @Test(priority = 1)
    void verifyCorrectLoginSection() {
        CommonHelper.openWebPage(URL, driver);
        verifyloginsectionTestCase1Helper.verifyGuruBankHomePage(driver);
        verifyloginsectionTestCase1Helper.typeMyUsername(driver);
        verifyloginsectionTestCase1Helper.typeMyPassword(driver);
        verifyloginsectionTestCase1Helper.clickLogin(driver);
        verifyloginsectionTestCase1Helper.verifyTheManagerPage(driver);
        verifyloginsectionTestCase1Helper.verifyTheManagerID(driver);
        verifyloginsectionTestCase1Helper.takeScreenShoot(driver);
    }


    @AfterTest()
    void closure() {
        driver.close();
    }

}
