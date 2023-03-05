package cucumberbdd;

import cucumberbdd.factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {

    private WebDriver driver;

    @Given("I am on the store page")
    public void iMonTheStorePage() {
        driver= DriverFactory.initializeDriver();
        driver.get("https://askomdch.com/store");
    }

    @When("I add {string} to the cart")
    public void iAddToTheCart(String arg0) {
       // throw new io.cucumber.java.PendingException();
    }

    @Then("I should see {int} {string} in the cart")
    public void iShouldSeeInTheCart(int arg0, String arg1) {
               // throw new io.cucumber.java.PendingException();
    }
}
