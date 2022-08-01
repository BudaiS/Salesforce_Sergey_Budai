package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LeadInformationPage;
import pages.LeadsPage;
import pages.NewLeadPage;

public class LeadsTests extends BaseTests {
    private final static String FIRST_NAME = "First";
    private final static String LAST_NAME = "Last";
    private final static String COMPANY = "ShabashCorporation";
    private final static String EXPECTED_NAME = "Mr. First Last";
    private LeadsPage leadsPage;
    private NewLeadPage newLeadPage;
    private LeadInformationPage leadInformationPage;

    @BeforeClass
    public void initialise() {
        leadsPage = new LeadsPage(driver);
        newLeadPage = new NewLeadPage(driver);
        leadInformationPage = new LeadInformationPage(driver);
    }

    @Test
    public void createLeadTest() {
        loginPage.setUserName(USERNAME);
        loginPage.setPassword(PASSWORD);
        loginPage.clickLoginButton();
        homePage.waitForPageLoaded();
        homePage.openLeadsTab();
        leadsPage.waitForPageLoaded();
        leadsPage.clickNewButton();
        newLeadPage.waitForPageLoaded();
        newLeadPage.clickSalutationButton();
        newLeadPage.clickSalutationMr();
        newLeadPage.setFirstName(FIRST_NAME);
        newLeadPage.setLastName(LAST_NAME);
        newLeadPage.setCompanyName(COMPANY);
        newLeadPage.clickSaveButton();
        leadInformationPage.waitForPageLoaded();
        Assert.assertEquals(leadInformationPage.getFieldNameText(), EXPECTED_NAME, "Checking the correctness of the data entered in the field");
        Assert.assertEquals(leadInformationPage.getCompanyFieldText(), COMPANY, "Checking the correctness of the data entered in the field");


    }
}
