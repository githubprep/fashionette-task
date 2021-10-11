package couk.fashionette.StepDefinitions;


import couk.fashionette.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Hooks {


    public WebDriver driver;

    @Before
    public void setUp(){

        driver = Driver.get();
        driver.manage().window().maximize();


    }

    @After
    public void tearDown(Scenario scenario) throws InterruptedException {
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }


        Driver.closeDriver();

    }


}