package util;

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
            WebDriver driver = new FirefoxDriver();
            return driver;

        // ********************
        } else if (browser.toLowerCase().contains("chrome")){ // chrome ****
            System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver");  // Linux und kopiert hierein
            WebDriver driver = new ChromeDriver();
            return driver;

        // ********************************
        } else { // selenium-Grid *****
            WebDriver driver = null;
            DesiredCapabilities cap;
            cap = DesiredCapabilities.firefox();
            cap.setBrowserName("firefox");

            try{
                URL url = new URL("http://localhost:4444/wd/hub");
                driver = new RemoteWebDriver(url, cap);
            } catch (Exception e) {
                System.out.println(e.toString());
            }

            return driver;
        }
    }

}
