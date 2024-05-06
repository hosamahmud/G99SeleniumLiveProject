package VerifyCreateEditNewCustomerTestCases;

import Data.LoadProperties;
import Driver.DriverSetup;
import commonUtils.CommonHelper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import verifycreatecustomerTestCase5.VerifyCreateCustomerTestCase5Helper;


public class VerifyCreateNewCustomerTestCase5 {

    String URL = LoadProperties.useData.getProperty("GuruURL");
    String browser = LoadProperties.useData.getProperty("Browser");
    VerifyCreateCustomerTestCase5Helper verifycreatenewcustomerTestCase5Helper = null;
    WebDriver driver = null;


    @BeforeTest()
    void initiate() {
        DriverSetup.driverConf(browser);
        driver = DriverSetup.getDriver();
        driver.manage().window().maximize();
        verifycreatenewcustomerTestCase5Helper = new VerifyCreateCustomerTestCase5Helper(driver);
    }

    @Test(priority = 1)
    void verifyCreateNewCustomer() {
        CommonHelper.openWebPage(URL, driver);
        verifycreatenewcustomerTestCase5Helper.verifyGuruBankHomePage(driver);
        verifycreatenewcustomerTestCase5Helper.typeMyUsername(driver);
        verifycreatenewcustomerTestCase5Helper.typeMyPassword(driver);
        verifycreatenewcustomerTestCase5Helper.clickLogin(driver);
        verifycreatenewcustomerTestCase5Helper.verifyTheManagerPage(driver);
        verifycreatenewcustomerTestCase5Helper.verifyTheManagerID(driver);
        verifycreatenewcustomerTestCase5Helper.clickNewCustomer(driver);
        verifycreatenewcustomerTestCase5Helper.typeNewCustomerName(driver);
        verifycreatenewcustomerTestCase5Helper.clickMaleGender(driver);
        verifycreatenewcustomerTestCase5Helper.typeNewCustomerBirthday(driver);
        verifycreatenewcustomerTestCase5Helper.typeNewCustomerAddress(driver);
        verifycreatenewcustomerTestCase5Helper.typeNewCustomerCity(driver);
        verifycreatenewcustomerTestCase5Helper.typeNewCustomerState(driver);
        verifycreatenewcustomerTestCase5Helper.typeNewCustomerPIN(driver);
        verifycreatenewcustomerTestCase5Helper.typeNewCustomerMobile(driver);
        verifycreatenewcustomerTestCase5Helper.typeNewCustomerMail(driver);
        verifycreatenewcustomerTestCase5Helper.typeNewCustomerPassword(driver);
        verifycreatenewcustomerTestCase5Helper.clickSubmitNewCustomer(driver);

    }


    @AfterTest()
    void closure() {
        driver.close();
    }

}
