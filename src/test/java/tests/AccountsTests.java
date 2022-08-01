package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AccountsDetailsPage;
import pages.AccountsPage;
import pages.NewAccountPage;

public class AccountsTests extends BaseTests {
    private final static String ACCOUNT_NAME = "New account";
    AccountsDetailsPage accountsDetailsPage;

    AccountsPage accountsPage;
    NewAccountPage newAccountPage;

    @BeforeClass
    public void initialise() {
        accountsPage = new AccountsPage(driver);
        newAccountPage = new NewAccountPage(driver);
        accountsDetailsPage = new AccountsDetailsPage(driver);

    }


    @Test
    public void createAccountsTest() {
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openAccountsTab();
        accountsPage.waitForPageLoaded();
        accountsPage.clickNewButton();
        newAccountPage.waitForPageLoaded();
        newAccountPage.setAccountName(ACCOUNT_NAME);
        newAccountPage.clickSaveButton();
        accountsDetailsPage.waitForPageLoaded();
        Assert.assertEquals(accountsDetailsPage.getAccountNameText(), ACCOUNT_NAME, "Checking the correctness of the data entered in the field");


    }
}
