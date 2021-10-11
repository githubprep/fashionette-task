package couk.fashionette.StepDefinitions;

import couk.fashionette.Utilities.BrowserUtils;
import couk.fashionette.pages.CartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartStepDef {

    @When("the user apply the voucher {string} to the cart")
    public void theUserApplyTheVoucherToTheCart(String couponName) {
        CartPage cartPage = new CartPage();
        BrowserUtils.waitFor(1);
        cartPage.usingVoucherCode(couponName);

    }
    @Then("the user sees that voucher code successfully applied message")
    public void theUserSeesThatVoucherCodeSuccessfullyAppliedMessage() {
        BrowserUtils.waitFor(1);
        CartPage cartPage = new CartPage();
        Assert.assertTrue("Success message doesn't exist", cartPage.voucherApplyMessage.isDisplayed());
    }

    @Then("the voucher is properly applied")
    public void TheVoucherIsProperlyApplied() {

        CartPage cartPage = new CartPage();
        String subTotalString = cartPage.subTotalPrice.getText().substring(1);
        double subTotal = Double.parseDouble(subTotalString);

        String totalString = cartPage.totalPrice.getText().substring(1);
        double total = Double.parseDouble(totalString);

        String voucherDiscountStr = cartPage.voucherDiscount.getText().substring(2);
        double voucherDiscount = Double.parseDouble(voucherDiscountStr);
        double difference = subTotal-voucherDiscount;


        Assert.assertEquals(difference, total, 0.1);


    }


}
