package elements.accounts;

import elements.BaseElements;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputComboBox extends BaseElements {
    private final static String BUTTON_LOCATOR = "//span[text() = '%s']//ancestor::span//following-sibling::div//a";
    private final static By TYPE_WAIT_LOCATOR = By.xpath("//a[@title='Competitor']");
    private final static By INDUSTRY_WAIT_LOCATOR = By.xpath("//a[@title='Banking']");
    private final static String OPTION_LOCATOR = "//a[text()='Banking']";
    WebDriverWait wait = new WebDriverWait(driver, 30);

    Actions action = new Actions(driver);

    public InputComboBox(WebDriver driver, String label) {
        super(driver, label);
    }

    private void selectOptionComboBox(String option) {
        By locator = By.xpath(String.format(OPTION_LOCATOR, label, option));
        System.out.printf("Settings %s input value = %s", label, option);
        driver.findElement(locator).click();
    }

    private void clickComboBoxButton() {
        WebElement button = driver.findElement(By.xpath(String.format(BUTTON_LOCATOR, label)));
        scrollIntoView(button);
        button.click();
    }

    public void selectByVisibleText(String visibleText) {
        clickComboBoxButton();
        selectOptionComboBox(visibleText);


    }

    private void clickAndSelectTypeInputComboBoxButton() {
        WebElement button = driver.findElement(By.xpath(String.format(BUTTON_LOCATOR, label)));
        scrollIntoView(button);
        button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(TYPE_WAIT_LOCATOR));
        action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ENTER);


    }

    private void clickAndSelectIndustryInputComboBoxButton() {
        WebElement button = driver.findElement(By.xpath(String.format(BUTTON_LOCATOR, label)));
        scrollIntoView(button);
        button.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(INDUSTRY_WAIT_LOCATOR));
        action.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.ENTER);


    }

}
