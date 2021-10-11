package couk.fashionette.StepDefinitions;

import couk.fashionette.Utilities.BrowserUtils;
import couk.fashionette.Utilities.ConfigurationReader;
import couk.fashionette.Utilities.Driver;
import couk.fashionette.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;


public class HomePageStepDef {
    @Given("the user is on the {string}")
    public void theUserIsOnThe(String page) {
       String pageUrl = ConfigurationReader.get(page);
       Driver.get().get(pageUrl);

    }

    @And("the user accepts the cookies")
    public void theUserAcceptsTheCookies() {
        HomePage homepage = new HomePage();
        BrowserUtils.waitForClickablility(homepage.cookiePopUp, 5);
        homepage.cookiePopUp.click();

    }



}
