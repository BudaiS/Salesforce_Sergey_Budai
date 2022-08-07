package pages;

import elements.lead.LightningFormattedElement;
import enums.LeadStatus;
import enums.Rating;
import models.Lead;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeadDetailsPage extends BasePage {

    public final static By ICON_LOCATOR = By.xpath("//div[@class='slds-media__figure']");


    public LeadDetailsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_LOCATOR);

    }


    public Lead getLeadInfo() {
        String company = new LightningFormattedElement(driver, "Company").getText();
        LeadStatus leadStatus = LeadStatus.fromString(new LightningFormattedElement(driver, "Lead Status").getText());
        Lead.LeadBuilder leadBuilder = new Lead.LeadBuilder(company, leadStatus);
        String fullName = new LightningFormattedElement(driver, "Name").getText();
        if (fullName != "") {
            leadBuilder.fullName(fullName);
        }
        String title = new LightningFormattedElement(driver, "Title").getText();
        if (title != "") {
            leadBuilder.title(title);
        }
        String phone = new LightningFormattedElement(driver, "Phone").getText();
        if (phone != "") {
            leadBuilder.phone(phone);
        }
        String email = new LightningFormattedElement(driver, "Email").getText();
        if (email != "") {
            leadBuilder.email(email);
        }
        String rating = new LightningFormattedElement(driver, "Rating").getText();
        if (rating != "") {
            leadBuilder.rating(Rating.fromString(rating));
        }


        String address = new LightningFormattedElement(driver, "Address").getText();
        if (address != "") {
            leadBuilder.fullAddress(address);
        }
        String website = new LightningFormattedElement(driver, "Website").getText();
        if (website != "") {
            leadBuilder.website(website);
        }

        return leadBuilder.build();
    }

}
