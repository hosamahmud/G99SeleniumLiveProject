package verifytheinvalidusernamepasswordTestCase4;

import commonUtils.CommonHelper;
import commonUtils.Util;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class VerifyInvalidUsernameUsernamePasswordTestCase4Helper extends VerifyInvalidUsernamePasswordTestCase4Po {

    public <WebDriver> VerifyInvalidUsernameUsernamePasswordTestCase4Helper(WebDriver driver) {
        PageFactory.initElements((SearchContext) driver, this);
    }

    //VerifyLoginSectionTestCase1Constants verifyLoginSectionTestCase1Constants = new VerifyLoginSectionTestCase1Constants();

    public void verifyGuruBankHomePage(WebDriver driver) {
        CommonHelper.verifyElementAppears(guruBankHomePage, driver);
    }

    public void typeMyUsername(WebDriver driver) {
        CommonHelper.sendText(usernameTextBox, Util.getInvalidUsername(), driver);
    }

    public void typeMyPassword(WebDriver driver) {

        CommonHelper.sendText(passwordTextBox, Util.getInvalidPassword(), driver);
    }

    public void clickLogin(WebDriver driver) {
        CommonHelper.clickWhenReady(loginButton, driver);
    }

    public String displayInvalid(WebDriver driver){
        return CommonHelper.getAlertMessage(driver);
    }


}





