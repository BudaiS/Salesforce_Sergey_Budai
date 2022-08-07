package pages.modals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public abstract class BaseModalPage extends BasePage {
    private final static By SAVE_BUTTON_LOCATOR = By.xpath("//button[@title='Save']");

    public BaseModalPage(WebDriver driver) {
        super(driver);
    }


    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(SAVE_BUTTON_LOCATOR);
        waitForElementClickable(SAVE_BUTTON_LOCATOR);


    }

    public void clickSaveButton() {
        driver.findElement(SAVE_BUTTON_LOCATOR).click();
    }

}
