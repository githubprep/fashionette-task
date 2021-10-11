package couk.fashionette.pages;



import couk.fashionette.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".icon--user")
    public WebElement loginIcon;

    @FindBy(css = ".icon.icon--till")
    public WebElement goToChart;

    /**
     * The method is used to dynamically choose
     * the top right icons which are Message, Login, Whishlist and Cart
     * @param iconName
     */
    public void iconGenerator(String iconName) {
        switch (iconName) {
            case "Basket":
                goToChart.click();
                break;
            case "Login":
                loginIcon.click();
                break;


        }


    }
}
