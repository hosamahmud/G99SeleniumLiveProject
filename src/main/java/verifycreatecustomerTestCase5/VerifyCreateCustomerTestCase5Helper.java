package verifycreatecustomerTestCase5;

import commonUtils.CommonHelper;
import commonUtils.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class VerifyCreateCustomerTestCase5Helper extends VerifyCreateCustomerTestCase5Po {

    public <WebDriver> VerifyCreateCustomerTestCase5Helper(WebDriver driver) {
        PageFactory.initElements((SearchContext) driver, this);
    }

    VerifyCreateCustomerCase5Constants verifycreatecustomertestcase5Constants = new VerifyCreateCustomerCase5Constants();

    public void verifyGuruBankHomePage(WebDriver driver) {
        CommonHelper.verifyElementAppears(guruBankHomePage, driver);
    }

    public void typeMyUsername(WebDriver driver) {
        CommonHelper.sendText(usernameTextBox, Util.getUsername(), driver);
    }

    public void typeMyPassword(WebDriver driver) {
        CommonHelper.sendText(passwordTextBox, Util.getPassword(), driver);
    }

    public void clickLogin(WebDriver driver) {
        CommonHelper.clickWhenReady(loginButton, driver);
    }


    public void verifyTheManagerPage(WebDriver driver) {
        CommonHelper.verifyElementAppears(managerMainPage, driver);
    }
    public void verifyTheManagerID(WebDriver driver) {
        String dynamicLocator = "//td[contains(text(),'Manger Id : "+ Util.getUsername() +"')]";
        WebElement dynamicUser = driver.findElement(By.xpath(dynamicLocator));
        CommonHelper.verifyDynamicElementAppears(dynamicUser, driver);
    }

    public void clickNewCustomer(WebDriver driver) {
        CommonHelper.clickWhenReady(newCustomerButton, driver);
    }

    public void typeNewCustomerName(WebDriver driver) {

        CommonHelper.sendText(nameTextBox,verifycreatecustomertestcase5Constants.newcustomername, driver);
    }

    public void clickMaleGender(WebDriver driver) {
        CommonHelper.clickWhenReady(maleGenderSelect, driver);
    }


    public void typeNewCustomerBirthday(WebDriver driver) {

        CommonHelper.sendText(birthBox,verifycreatecustomertestcase5Constants.newcustomerBirth, driver);
    }
    public void typeNewCustomerAddress(WebDriver driver) {

        CommonHelper.sendText(addressTextBox,verifycreatecustomertestcase5Constants.newcustomeraddress, driver);
    }

    public void typeNewCustomerCity(WebDriver driver) {

        CommonHelper.scrollToElement(cityTextBox,driver);
        CommonHelper.sendText(cityTextBox,verifycreatecustomertestcase5Constants.newcustomerCity , driver);
    }

    public void typeNewCustomerState(WebDriver driver) {

        CommonHelper.scrollToElement(stateTextBox,driver);
        CommonHelper.sendText(stateTextBox,verifycreatecustomertestcase5Constants.newcustomerState , driver);
    }

    public void typeNewCustomerPIN(WebDriver driver) {

        CommonHelper.scrollToElement(pinTextBox,driver);
        CommonHelper.sendText(pinTextBox,verifycreatecustomertestcase5Constants.newcustomerPin , driver);
    }

    public void typeNewCustomerMobile(WebDriver driver) {

        CommonHelper.scrollToElement(mobileNumberTextBox,driver);
        CommonHelper.sendText(mobileNumberTextBox,verifycreatecustomertestcase5Constants.newcustomerMobile , driver);
    }

    public void typeNewCustomerMail(WebDriver driver) {

        CommonHelper.scrollToElement(emailTextBox,driver);
        CommonHelper.sendText(emailTextBox,verifycreatecustomertestcase5Constants.newcustomerEmail , driver);
    }

    public void typeNewCustomerPassword(WebDriver driver) {
        CommonHelper.scrollToElement(passwordCustomerTextBox,driver);
        CommonHelper.sendText(passwordCustomerTextBox,Util.getNewCustomerPassword(),driver);
    }

    public void clickSubmitNewCustomer(WebDriver driver) {
        CommonHelper.scrollToElement(submitButton,driver);
        CommonHelper.clickWhenReady(submitButton, driver);
    }
















    public void takeScreenShoot(WebDriver driver){
        String MainPageshot = null;
        CommonHelper.takeSnapShot(MainPageshot,driver);
    }

}





