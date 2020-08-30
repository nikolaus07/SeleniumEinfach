package pages;

import Glue_Steps.CommonWebDriverSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class GooglePage {
    public static WebElement favoritSport_RadionBtn(String sport) {
        // to do if sport,         // then ....   (( aktuell only Hockey ))
        String xpaht = "//*[@id = 'gwt-debug-cwRadioButton-sport-Hockey-input']";
        WebDriver driver = CommonWebDriverSteps.getWebDriver();
        WebElement ele = driver.findElement(By.xpath(xpaht));
        return ele;
    }

    public static WebElement addRow_Btn(String add_or_remove) {
        String xpaht = "//button[text() = '" + add_or_remove + "']";
        WebDriver driver = CommonWebDriverSteps.getWebDriver();
        WebElement ele = driver.findElement(By.xpath(xpaht));
        return ele;
    }

    public static WebElement checkboxDay_CB(String day) {
        String xpaht = "//input";
        WebDriver driver = CommonWebDriverSteps.getWebDriver();
        List<WebElement> allElements = driver.findElements(By.xpath(xpaht));
        switch (day) {  // e.g  element = allElements.get(1); (( for Tuesday ))
            case "Monday":
                return allElements.get(0);
            case "Tuesday":
                return allElements.get(1);
            case "Wednesday":
                return allElements.get(2);
            case "Thursday":
                return allElements.get(3);
            case "Friday":
                return allElements.get(4);
            case "Saturday":
                return allElements.get(5);
            case "Sunday":
                return allElements.get(6);
        }
        return null;
    }

}
