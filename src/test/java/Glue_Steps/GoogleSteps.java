package Glue_Steps;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.GooglePage;
import util.WebDriverBrowser;

public class GoogleSteps extends CommonWebDriverSteps {

    @After
    public void closeBrowser() {
        closeBrowserAfterRunningAllTests();
    }

    @Given("^navigate to page: \"([^\"]*)\"$")
    public void navigateToPage(String url) throws Throwable {
        getWebDriver().navigate().to(url);
        Thread.sleep(1000);
    }

    @Then("^Set Checkbox on day: \"([^\"]*)\"$")
    public void setCheckboxOnDay(String tag) throws Throwable {
        WebElement we = GooglePage.checkboxDay_CB(tag);
        we.click();
    }

    @Then("^Flex Table: \"([^\"]*)\"$")
    public void flexTable(String add_or_remove) throws Throwable {
        WebElement we = GooglePage.addRow_Btn(add_or_remove);
        we.click();
    }

    @Then("^Set favorit-sport RB to: \"([^\"]*)\"$")
    public void setFavoritSportRBTo(String sport) throws Throwable {
        Thread.sleep(1000);
        WebElement we = GooglePage.favoritSport_RadionBtn(sport);
        we.click();
    }

    @Then("^test_test \"([^\"]*)\"$")
    public void test_test(String xx) throws Throwable {
        System.out.println("in stest test" + xx);
    }

    @Given("^Web Browser is: \"([^\"]*)\"$")
    public void webBrowserIs(String browser) throws Throwable {
        WebDriverBrowser wdb = new WebDriverBrowser(browser);
        WebDriver d = wdb.createWebDriver();
        setWebDriver(d);
    }

    @Then("^test_failed$")
    public void test_failed() throws Throwable {
        assert (true);
        assert (false);
        assert (false);
        webBrowserIs("ddd");
    }
}
