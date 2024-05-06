package verifytheloginsectionTestCase1;

import commonUtils.CommonHelper;
import commonUtils.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class VerifyLoginSectionTestCase1Helper extends VerifyLoginSectionTestCase1Po {

    public <WebDriver> VerifyLoginSectionTestCase1Helper(WebDriver driver) {
        PageFactory.initElements((SearchContext) driver, this);
    }

    //VerifyLoginSectionTestCase1Constants verifyLoginSectionTestCase1Constants = new VerifyLoginSectionTestCase1Constants();

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

    public void takeScreenShoot(WebDriver driver){
        String MainPageshot = null;
        CommonHelper.takeSnapShot(MainPageshot,driver);
    }

}





