package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadsPage extends BasePage {
    private final static By NEW_BUTTON = By.cssSelector("div.active a[title=New]");
    private final static By CHECKBOX_LOCATOR = By.cssSelector("label.slds-checkbox");


    public LeadsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(CHECKBOX_LOCATOR);

    }

    public void clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
    }

}
