package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadInformationPage extends BasePage {
    public final static By FIELD_NAME = By.xpath("//lightning-formatted-name[@slot='primaryField']");
    public final static By ICON_LOCATOR = By.xpath("//div[@class='slds-media__figure']");
    public final static By FIELD_COMPANY = By.xpath("//span[@class='test-id__field-label'][text()='Company']//parent::div//following-sibling::div//lightning-formatted-text");


    public LeadInformationPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_LOCATOR);

    }

    public String getFieldNameText() {
        return driver.findElement(FIELD_NAME).getText();
    }

    public String getCompanyFieldText() {
        return driver.findElement(FIELD_COMPANY).getText();
    }

}
