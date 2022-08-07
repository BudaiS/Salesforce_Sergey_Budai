package elements.accounts;

import elements.BaseElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Objects;

public class InputTextArea extends BaseElements {

    private final static String INPUT_LOCATOR = "//span[text()='%s']//ancestor::label//following-sibling::textarea";

    public InputTextArea(WebDriver driver, String label) {
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
