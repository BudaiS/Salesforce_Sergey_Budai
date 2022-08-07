package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public abstract class EntityBasePage extends BasePage {

    private final static By ALERT_MESSAGE_LOCATOR = By.xpath("//div[@role='alertdialog']");
    private final static By NEW_BUTTON = By.cssSelector("div.active a[title=New]");
    private final static By ENTITIES_LINK_LOCATOR = By.cssSelector("table[role=grid] a[data-refid=recordId");

    public EntityBasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(NEW_BUTTON);
        waitForElementClickable(NEW_BUTTON);


    }


    public boolean isAlertMessageDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ALERT_MESSAGE_LOCATOR));
        return driver.findElement(ALERT_MESSAGE_LOCATOR).isDisplayed();
    }

    public void clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
    }

    private List<WebElement> getAllEntityLinks() {
        return driver.findElements(ENTITIES_LINK_LOCATOR);
    }

    public void openEntityByName(String entityName) {
        List<WebElement> allLinks = getAllEntityLinks();
        allLinks.stream().filter(webElement -> webElement.getText().equals(entityName)).findFirst().get().click();
    }

    public void openFirstEntityByTable() {
        List<WebElement> allLinks = getAllEntityLinks();
        allLinks.get(0).click();

    }
}
