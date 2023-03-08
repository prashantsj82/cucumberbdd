package cucumberbdd.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    private static WebDriver driver;

    public static WebDriver initializeDriver(){
        System.setProperty("WebDriver.chrome.driver", "C:\\MyPintu\\Personal\\Tech-Trainings\\A_UDEMY\\Cucumber_Selenium_RestAPI\\BrowserDrivers\\chromedriver.exe");
        //System.setProperty("WebDriver.chrome.driver", "/path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;

    }

    public static WebDriver getDriver(){
        return driver;
    }

}
