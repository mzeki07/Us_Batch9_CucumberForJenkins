package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverClass {
    private static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        }
        return driver;
    }

    public static void quitDriver(){
        driver.quit();
        driver = null;
    }
}
