package cucumberbdd.hooks;

import cucumberbdd.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class MyHooks {

    private static WebDriver driver;

    @Before
    public void before(){
        driver = DriverFactory.initializeDrive();
    }

    @After
    public void after(){
        driver.quit();
    }
}
