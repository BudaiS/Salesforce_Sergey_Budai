package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsPage extends BasePage {
    private final static By CHECKBOX_LOCATOR = By.xpath("//span[@class='slds-checkbox--faux']");
    private final static By NEW_BUTTON = By.xpath("//div[@title='New']");

    public AccountsPage(WebDriver driver) {
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
