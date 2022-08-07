package elements.lead;

import elements.BaseElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class LightningTextArea extends BaseElements {

    private final static String INPUT_LOCATOR = "//*[contains(@class,'modal-body')]//label[text()='%s']/ancestor::lightning-textarea//following-sibling::div//textarea";

    public LightningTextArea(WebDriver driver, String label) {
        super(driver, label);
    }

    public void setValue(String value) {
        WebElement inputElement = driver.findElement(By.xpath(String.format(INPUT_LOCATOR, label)));
        if (Objects.nonNull(value)) {
            System.out.printf("Settings %s input value = %s", label, value);
            scrollIntoView(inputElement);
            inputElement.sendKeys(value);
        }

    }
}
