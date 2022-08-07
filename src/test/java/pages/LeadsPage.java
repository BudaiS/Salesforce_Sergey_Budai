package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.modals.NewLeadModalPage;


public class LeadsPage extends BasePage {

    private final static By NEW_BUTTON = By.cssSelector("div.active a[title=New]");


    public LeadsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(NEW_BUTTON);
        waitForElementClickable(NEW_BUTTON);

    }

    public NewLeadModalPage clickNewButton() {
        driver.findElement(NEW_BUTTON).click();
        return new NewLeadModalPage(driver);
    }


}
