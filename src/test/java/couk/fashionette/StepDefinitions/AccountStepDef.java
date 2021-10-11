package couk.fashionette.StepDefinitions;


import couk.fashionette.Utilities.BrowserUtils;
import couk.fashionette.pages.AccountPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class AccountStepDef {

    AccountPage accountPage = new AccountPage();
    @And("the user clicks the PERSONAL DATA")
    public void theUserClicksThePERSONALDATA() {

        accountPage.personalDataTab.click();
    }

    @And("the user clicks the edit button under Customer information")
    public void theUserClicksTheEditButtonUnderCustomerInformation() {

        accountPage.editLink.click();
    }

    @When("the user clicks save button")
    public void theUserClicksSaveButton() {
        accountPage.saveLink.click();
        BrowserUtils.waitForVisibility(accountPage.editLink, 5);

    }


    @And("the user enters the new Name {string} and Surname {string}")
    public void theUserEntersTheNewNameAndSurname(String name, String surname) {
        accountPage.updateUserInformation(name, surname);

    }

    @Then("verify that Name and Surname has changed to new Name {string} and Surname {string}")
    public void verifyThatNameAndSurnameHasChangedToNewNameAndSurname(String newName, String newSurname) {
        accountPage.checkUserData();
        Assert.assertEquals(newName, accountPage.actualName);
        Assert.assertEquals(newSurname, accountPage.actualSurname);
    }

}

