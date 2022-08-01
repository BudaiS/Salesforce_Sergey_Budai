package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountsDetailsPage extends BasePage {
    private final static By ICON_LOCATOR = By.xpath("//img[@title='Account']");
    private final static By ACCOUNT_NAME_FIELD = By.xpath("//span[@class='test-id__field-label'][text()='Account Name']//parent::div//following-sibling::div//lightning-formatted-text");


    public AccountsDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_LOCATOR);

    }

    public String getAccountNameText() {
        return driver.findElement(ACCOUNT_NAME_FIELD).getText();
    }
}
