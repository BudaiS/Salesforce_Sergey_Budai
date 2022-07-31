package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private final static String URL = "https://tmsqa191.my.salesforce.com/";
    private final static By USERNAME_INPUT = By.id("username");
    private final static By PASSWORD_INPUT = By.id("password");
    private final static By LOGIN_BUTTON = By.id("Login");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(USERNAME_INPUT);
    }

    public void open() {
        driver.get(URL);
    }

    public void setUserName(String username) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
    }

    public void setPassword(String password) {
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();

    }
}
