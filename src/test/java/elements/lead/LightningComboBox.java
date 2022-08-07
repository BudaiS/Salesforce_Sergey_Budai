package elements.lead;

import elements.BaseElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LightningComboBox extends BaseElements {
    private final static String BUTTON_LOCATOR = "//label[text() = '%s']/following-sibling::div//button";
    private final static String OPTION_LOCATOR = "//label[text() = '%s']//following-sibling::div//lightning-base-combobox-item//*[@title='%s']";


    public LightningComboBox(WebDriver driver, String label) {
        super(driver, label);
    }

    private void clickComboBoxButton() {
        WebElement button = driver.findElement(By.xpath(String.format(BUTTON_LOCATOR, label)));
        scrollIntoView(button);
        button.click();
    }

    private void selectOptionComboBox(String option) {
        By locator = By.xpath(String.format(OPTION_LOCATOR, label, option));
        driver.findElement(locator).click();
    }

    public void selectByVisibleText(String visibleText) {
        clickComboBoxButton();
        selectOptionComboBox(visibleText);


    }
}
