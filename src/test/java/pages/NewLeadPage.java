package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class NewLeadPage extends BasePage {
    private final static By SAVE_BUTTON = By.xpath("//button[@name='SaveEdit']");
    private final static By FIRST_NAME_INPUT = By.xpath("//input[@name='firstName']");
    private final static By LAST_NAME_INPUT = By.xpath("//input[@name='lastName']");
    private final static By COMPANY_INPUT = By.xpath("//input[@name='Company']");
    private final static By SALUTATION_DROPDOWN = By.xpath("//button[@name='salutation']");
    private final static By LEAD_STATUS_DROPDOWN = By.xpath("//button[starts-with(@aria-label, 'Lead Status')]");
    private final static By SALUTATION_MR = By.xpath("//span[@title='Mr.']");
    private final static By LEAD_STATUS_CONTACTED = By.xpath("//button[starts-with(@aria-label, 'Lead Status')]//span[text()='Contacted']");
    Actions actions = new Actions(driver);


    public NewLeadPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(SAVE_BUTTON);

    }

    public void clickSalutationButton() {
        driver.findElement(SALUTATION_DROPDOWN).click();
    }

    public void clickSalutationMr() {
        driver.findElement(SALUTATION_MR).click();
    }

    public void setFirstName(String firstName) {
        driver.findElement(FIRST_NAME_INPUT).sendKeys(firstName);
    }

    public void setLastName(String lastName) {
        driver.findElement(LAST_NAME_INPUT).sendKeys(lastName);
    }

    public void setCompanyName(String companyName) {
        driver.findElement(COMPANY_INPUT).sendKeys(companyName);
    }

    public void clickLeadStatusButton() {
        driver.findElement(LEAD_STATUS_DROPDOWN).click();
    }

    public void clickLeadStatusContacted() {

        driver.findElement(LEAD_STATUS_CONTACTED).click();
    }

    public void clickSaveButton() {
        driver.findElement(SAVE_BUTTON).click();
    }


}
