package couk.fashionette.pages;

import couk.fashionette.Utilities.BrowserUtils;
import couk.fashionette.Utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@name='email']")
    public WebElement emailInputBox;

    @FindBy(xpath ="//input[@name='password']" )
    public  WebElement passwordInputBox;

    @FindBy(css = ".btn__submit")
    public WebElement loginButton;


    /**
     * The method is used to Log in
     * @param userName
     * @param password
     */
    public void login(String userName, String password){
        emailInputBox.sendKeys(userName);
        passwordInputBox.sendKeys(password);
        loginButton.click();


    }
}
