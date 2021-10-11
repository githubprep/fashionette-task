package couk.fashionette.StepDefinitions;

import couk.fashionette.Utilities.BrowserUtils;
import couk.fashionette.pages.LoginPage;
import io.cucumber.java.en.And;

public class LoginStepDef {

    LoginPage loginpage = new LoginPage();


    @And("the user should login with userName {string} and password {string}")
    public void theUserShouldLoginWithUserNameAndPassword(String username, String password) {

        BrowserUtils.waitFor(1);
        loginpage.login(username, password);
    }


}
