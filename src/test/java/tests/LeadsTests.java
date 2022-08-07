package tests;

import com.github.javafaker.Faker;
import enums.LeadStatus;
import models.Lead;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LeadDetailsPage;
import pages.LeadsPage;
import pages.modals.NewLeadModalPage;


public class LeadsTests extends BaseTests {

    private LeadsPage leadsPage;
    private NewLeadModalPage newLeadModalPage;
    private LeadDetailsPage leadDetailsPage;

    @BeforeClass
    public void initialise() {
        leadsPage = new LeadsPage(driver);
        newLeadModalPage = new NewLeadModalPage(driver);
        leadDetailsPage = new LeadDetailsPage(driver);
    }

    @Test
    public void createLeadTest() throws InterruptedException {
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openLeadsTab();
        leadsPage.waitForPageLoaded();
        leadsPage.clickNewButton();
        Thread.sleep(10000);
        Faker faker = new Faker();
        Lead testLead = new Lead.LeadBuilder(faker.company().name(), LeadStatus.QUALIFIED)
                .lastName(faker.name().lastName())
                .build();


        newLeadModalPage.filForm(testLead);
        newLeadModalPage.clickSaveButton();
        Thread.sleep(10000);


        // Assert.assertTrue(leadsPage.isConfirmationPopupPresent());
        Assert.assertEquals(leadDetailsPage.getLeadInfo(), testLead);


    }
}
