package couk.fashionette.Utilities;

import couk.fashionette.StepDefinitions.AccountStepDef;
import io.cucumber.java.bs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProductLocaterGenerator {
    private static Logger LOG = LoggerFactory.getLogger(ProductLocaterGenerator.class);

    /**
     * The function is used to produce locators
     * @param idNumber
     * @return
     */
    public WebElement Locate(String idNumber) {
        String locators = "//*[@data-product-id=" + "\'" + idNumber + "\'" + "]";

        WebElement articleNumber = Driver.get().findElement(By.xpath(locators));

        LOG.info("Locators{}",locators);
        return articleNumber;

    }
    public WebElement verifyProduct(String idNumber) {
        String locators = "//*[@data-product-configure=" + "\'" + idNumber + "\'" + "]";

        WebElement articleNumber = Driver.get().findElement(By.xpath(locators));

        return articleNumber;

    }

    public void addProduct (String idNumber){
        Locate(idNumber).click();

    }
}

