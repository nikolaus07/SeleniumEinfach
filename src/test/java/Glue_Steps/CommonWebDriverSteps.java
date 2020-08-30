package Glue_Steps;

import org.openqa.selenium.WebDriver;

public class CommonWebDriverSteps {

    public static WebDriver driver;

    void setWebDriver(WebDriver dr) {
        driver = dr;
    }

    public static WebDriver getWebDriver() {
        return driver;
    }

    public void closeBrowserAfterRunningAllTests() {
        // System.out.println("##### Close browser after running this story ####");
        if (driver != null) {
            try {
                driver.quit();
            } catch (Exception e) {
            }
            driver = null;
        }
    }

}
