package util;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.URL;

public class WebDriverBrowser {

    private String browser;
    private WebDriver driver_loc;

    public WebDriverBrowser(String browser){
        this.browser = browser;
    }

    public WebDriver createWebDriver() {
        if (browser.toLowerCase().contains("fire")){
            System.setProperty("webdriver.gecko.driver","src/test/resources/driver/geckodriver");  // Linux und kopiert hierein

            String firePath = "usr/bin/firefox hat keinen einfluss";
            File pathBin = new File(firePath);

            FirefoxProfile fp = new FirefoxProfile();
            fp.setAcceptUntrustedCertificates(true);
            FirefoxOptions ffo = new FirefoxOptions();
            ffo.setBinary(pathBin.getPath());
            ffo.setProfile(fp);  // FirefoxProfile
            driver_loc = new FirefoxDriver();

            // ********************
        } else if (browser.toLowerCase().contains("chrome")){ // chrome ****
            System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver");  // Linux und kopiert hierein
            driver_loc = new ChromeDriver();

            // ********************************
        } else { // selenium-Grid *****
            DesiredCapabilities cap;
            cap = DesiredCapabilities.firefox();
            cap.setBrowserName("firefox");

            try{
                URL url = new URL("http://localhost:4444/wd/hub");
                driver_loc = new RemoteWebDriver(url, cap);
            } catch (Exception e) {
                System.out.println(e.toString());
            }
        }

        driver_loc.manage().window().setPosition(new Point(130, 130));
        driver_loc.manage().window().setSize(new Dimension(1024, 768));
        return driver_loc;
    }

}
