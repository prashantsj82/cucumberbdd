package cucumberbdd;

import cucumberbdd.constants.EndPoint;
import cucumberbdd.constants.MyConstants;
import cucumberbdd.factory.DriverFactory;
import cucumberbdd.pages.StorePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class MyStepdefs {

    private WebDriver driver;

    @Given("I am on the store page")
    public void iMonTheStorePage() {
        driver= DriverFactory.getDriver();
        new StorePage(driver).load(EndPoint.STORE.url);
    }

    @When("I add {string} to the cart")
    public void iAddToTheCart(String arg0) {
    //    new StorePage(driver).addToCart(product.getName());
    }

    @Then("I should see {int} {string} in the cart")
 /*    public void iShouldSeeInTheCart(int quantity, Product product) {
               // throw new io.cucumber.java.PendingException();
       CartPage cartPage= new CartPage(driver);
        Assert.assertEquals(product.getName(), cartPage.getProductName());
        Assert.assertEquals(quantity, cartPage.getProductQuantity());
    }  */

    @Given("I am oa guest customer")
    public void iMAGuestCustomer() {
        driver= DriverFactory.getDriver();
        new StorePage(driver).load(MyConstants.STORE);
    }
}
