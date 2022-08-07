package pages.modals;

import elements.lead.LightningComboBox;
import elements.lead.LightningInput;
import models.Lead;
import org.openqa.selenium.WebDriver;


public class NewLeadModalPage extends BaseModalPage {


    public NewLeadModalPage(WebDriver driver) {
        super(driver);
    }


    public void filForm(Lead inputLead) {
//        new LightningComboBox(driver, "Salutation").selectByVisibleText(inputLead.getSalutation().getName());
        new LightningInput(driver, "First Name").setValue(inputLead.getFirstName());
        new LightningInput(driver, "Last Name").setValue(inputLead.getLastName());
        new LightningInput(driver, "Company").setValue(inputLead.getCompany());
        new LightningInput(driver, "Title").setValue(inputLead.getTitle());
        new LightningComboBox(driver, "Lead Status").selectByVisibleText(inputLead.getLeadStatus().getName());
        new LightningInput(driver, "Phone").setValue(inputLead.getPhone());
        new LightningInput(driver, "Email").setValue(inputLead.getEmail());
        //      new LightningComboBox(driver, "Rating").selectByVisibleText(inputLead.getRating().getName());
       /* new LightningTextArea(driver, "Street").setValue(inputLead.getStreet());
        new LightningInput(driver, "City").setValue(inputLead.getCity());
        new LightningInput(driver, "State/Province").setValue(inputLead.getState());
        new LightningInput(driver, "Zip/Postal Code").setValue(inputLead.getZipCode());
        new LightningInput(driver, "Country").setValue(inputLead.getCountry());
        new LightningInput(driver, "Website").setValue(inputLead.getWebsite());
        new LightningInput(driver, "No. of Employees").setValue(inputLead.getNoOfEmployees());
        new LightningInput(driver, "Annual Revenue").setValue(inputLead.getAnnualRevenue());
  //      new LightningComboBox(driver, "Lead Source").selectByVisibleText(inputLead.getLeadSource().getName());
   //     new LightningComboBox(driver, "industry").selectByVisibleText(inputLead.getIndustry().getName());
        new LightningTextArea(driver, "Description").setValue(inputLead.getDescription());*/

    }


}
