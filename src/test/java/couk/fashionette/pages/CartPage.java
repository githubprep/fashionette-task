package couk.fashionette.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(css = ".cart__sum__voucher-link")
    public WebElement redeemLink;

    @FindBy(name = "voucherCode")
    public WebElement couponBox;

    @FindBy(xpath = "//button[normalize-space()='redeem']")
    public WebElement redeemButton;

    @FindBy(css = ".text__right.typography__type-2.cart__subtotal")
    public WebElement subTotalPrice;

    @FindBy(css = "#cart__total")
    public WebElement totalPrice;

    @FindBy(css = "span[data-code='qachallenge']")
    public WebElement voucherDiscount;

    @FindBy(css = "tr[class='cart__sum__payment__installment-shipping-note'] td")
    public WebElement voucherApplyMessage;

    /**
     * This method is used to apply voucher
     * @param couponName
     */
    public void usingVoucherCode(String couponName){
       redeemLink.click();
       couponBox.sendKeys(couponName);
       redeemButton.click();
    }





}

