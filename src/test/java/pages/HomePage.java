package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private final static By USER_ICON_LOCATOR = By.xpath("//ul[@class='slds-global-actions']//li[last()]");
    private final static By LEADS_TAB_LOCATOR = By.xpath("//*[@title='Leads']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(USER_ICON_LOCATOR);

    }

    public boolean isUserIconDisplayed() {
        return driver.findElement(USER_ICON_LOCATOR).isDisplayed();
    }

    public void openLeadsTab() {
        jsClick(driver.findElement(LEADS_TAB_LOCATOR));
    }


}
