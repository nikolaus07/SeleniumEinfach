import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;

public class TestSelenium {

    public static void main(String[] args) throws InterruptedException {

        Logger logger = LoggerFactory.getLogger(TestSelenium.class);
        logger.trace("***** Hello klaus ***********");

        TestSelenium ts = new TestSelenium();
        ts.testFireFox();
    }


    public static void testFireFox() {

        System.setProperty("webdriver.gecko.driver","verzeichnis\\...\\geckodriver.exe"); // windows
        System.setProperty("webdriver.gecko.driver","src/main/resources/geckodriver");  // Linux und kopiert hierein

        String firePath = "usr/bin/firefox hat keinen einfluss";
        File pathBin = new File(firePath);

        FirefoxProfile fp = new FirefoxProfile();
        fp.setAcceptUntrustedCertificates(true);
        FirefoxOptions ffo = new FirefoxOptions();
        ffo.setBinary(pathBin.getPath());
        ffo.setHeadless(false);  // see no difference
        ffo.setCapability("acceptInsecureCerts", true);
        ffo.setProfile(fp);  // FirefoxProfile

        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.get("http://www.ebay.de");

    }




}
