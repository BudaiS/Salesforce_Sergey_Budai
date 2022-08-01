package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewAccountPage extends BasePage {
    private final static By SAVE_AND_NEW_LOCATOR = By.xpath("//span[@dir='ltr'][text()='Save & New']");
    private final static By ACCOUNT_NAME_INPUT = By.xpath("//input[@role='combobox'][not(contains(@title, 'Search Accounts'))]");
    private final static By SAVE_BUTTON = By.xpath("//button[@title='Save']");

    public NewAccountPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(SAVE_AND_NEW_LOCATOR);

    }

    public void setAccountName(String accountName) {
        driver.findElement(ACCOUNT_NAME_INPUT).sendKeys(accountName);
    }

    public void clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
    }
}
