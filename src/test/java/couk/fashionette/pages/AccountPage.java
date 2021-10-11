package couk.fashionette.pages;

import couk.fashionette.Utilities.ConfigurationReader;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage{
    public String actualName ;
    public String actualSurname ;


    @FindBy(xpath = "//div[@class=\"account-personaldata\"]")
    public WebElement personalDataTab;

    @FindBy(css = ".account--address__action--update")
    public WebElement editLink;

    @FindBy(name = "firstName")
    public WebElement firstNameTextBox;

    @FindBy(name = "lastName")
    public WebElement lastNameTextBox;

    @FindBy(css = ".account--address__action--save")
    public WebElement saveLink;

    @FindBy(xpath = "(//div[starts-with(@class,\"account__content_\")][1])[1]")
    public WebElement userData;

    /**
     * The method is used for getting actual Name and Surname from Personal Data Tab
     */
    public void checkUserData(){
        String actualUserData = userData.getText();
        String [] array = actualUserData.split("\n");
        String [] array2 = array[0].split(" ");
        actualName= array2[1];
        actualSurname = array2[2];

    }

    /**
     * the method is used to update Name and Surname in Personal Data Tab
     * @param name
     * @param surname
     */
    public void updateUserInformation(String name, String surname){
        firstNameTextBox.clear();
        firstNameTextBox.sendKeys(name);
        lastNameTextBox.clear();
        lastNameTextBox.sendKeys(surname);

    }



}
