package couk.fashionette.StepDefinitions;

import couk.fashionette.Utilities.BrowserUtils;
import couk.fashionette.Utilities.ConfigurationReader;
import couk.fashionette.Utilities.Driver;
import couk.fashionette.Utilities.ProductLocaterGenerator;
import couk.fashionette.pages.BasePage;
import couk.fashionette.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class ProductStepDef extends BasePage {

    @When("the user navigates to the {string} page")
    public void the_user_navigates_to_the_page(String module) {
        String mainuRL = ConfigurationReader.get("HomePage");
        String moduleUrl = mainuRL + "/" + module;
        Driver.get().navigate().to(moduleUrl);


    }


    @And("the user add a product {string} to the cart")
    public void theUserAddAProductToTheCart(String productNumber) {
        ProductLocaterGenerator productLocaterGenerator = new ProductLocaterGenerator();
        productLocaterGenerator.addProduct(productNumber);
        ProductPage productPage = new ProductPage();
        productPage.addCartButton.click();

    }

    @Then("verify that the user can see the added product {string} in the cart")
    public void verifyThatTheUserCanSeeTheAddedProductInTheCart(String productNumber) {
       BrowserUtils.waitFor(2);
        ProductLocaterGenerator productLocaterGenerator = new ProductLocaterGenerator();
        Assert.assertTrue("The Product does not exist", productLocaterGenerator.verifyProduct(productNumber).isDisplayed());
    }

    @And("the user clicks to the {string} icon at the top of the right corner")
    public void theUserClicksToTheIconAtTheTopOfTheRightCorner(String iconName) {
         iconGenerator(iconName);
        }


    }

