package tests;

import com.github.javafaker.Faker;
import models.Account;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AccountsDetailsPage;
import pages.AccountsPage;
import pages.modals.NewAccountModalPage;

public class AccountsTests extends BaseTests {

    AccountsDetailsPage accountsDetailsPage;

    AccountsPage accountsPage;
    NewAccountModalPage newAccountModalPage;

    @BeforeClass
    public void initialise() {
        accountsPage = new AccountsPage(driver);
        newAccountModalPage = new NewAccountModalPage(driver);
        accountsDetailsPage = new AccountsDetailsPage(driver);

    }


    @Test
    public void createAccountsTest() throws InterruptedException {
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openAccountsTab();
        accountsPage.waitForPageLoaded();
        accountsPage.clickNewButton();
        newAccountModalPage.waitForPageLoaded();
        Faker faker = new Faker();
        Account testAccount = new Account.AccountsBuilder(faker.name().username())
                // .annualRevenue("123")
                // .billingZipCode("12345")
                .description("sdjck")
                .phone("1234535")
                .website("dsjvjksd.com")
                // .employees("12886")
                .fax("12233756")
                .shippingZipCode("8970")
                .shippingCity("SSKJn")
                .shippingCountry("njsdcks")
                .shippingState("asnc")
                .shippingStreet("sdjckds")
                .build();


        newAccountModalPage.fillForm(testAccount);
        newAccountModalPage.clickSaveButton();
        Thread.sleep(10000);


        //Assert.assertTrue(accountsDetailsPage.isAlertMessageDisplayed(), "");
        Assert.assertEquals(accountsDetailsPage.getAccountInfo(), testAccount);


    }
}
