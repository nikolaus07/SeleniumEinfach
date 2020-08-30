package util;

import org.openqa.selenium.WebElement;

public class ClickSendKeyClear {

    public static void clickElement(WebElement element, int milliseconds){
        element.click();
    }

    // chrome is not valid from 15.11.2018
    // try internet-explorer.   Click but do not click. Workaround click twice
    public static void clickButton(WebElement element, int milliseconds) throws InterruptedException {
        clickElement(element, milliseconds);
        Thread.sleep(200);
        try {
            element.click();
            Thread.sleep(200);
        } catch (Exception e) {
            Thread.sleep(200);
        }
    }

    public static void clearAndSendKeyElement(WebElement element, String text, int milliseconds){
        element.clear();
        element.clear();
        element.sendKeys(text);
    }

}
