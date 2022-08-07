package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseTests {

    @Test
    public void loginTests() {
        loginPage.waitForPageLoaded();
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        Assert.assertTrue(homePage.isUserIconDisplayed());

    }


}
