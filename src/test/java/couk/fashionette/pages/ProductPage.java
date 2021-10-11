package couk.fashionette.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    @FindBy(css = "div[class='btn btn--bigger-icon preventspinner btn-default'] div[class='btn__content']")
    public WebElement addCartButton;


}
