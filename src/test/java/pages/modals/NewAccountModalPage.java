package pages.modals;

import elements.accounts.Input;
import elements.accounts.InputAccountParentAccount;
import elements.accounts.InputTextArea;
import models.Account;
import org.openqa.selenium.WebDriver;

public class NewAccountModalPage extends BaseModalPage {


    public NewAccountModalPage(WebDriver driver) {
        super(driver);
    }

    public void fillForm(Account inputAccount) {
        new InputAccountParentAccount(driver, "Account Name").setValue(inputAccount.getAccountsName());
        new InputAccountParentAccount(driver, "Parent Account").setValue(inputAccount.getParentAccount());
        new Input(driver, "Phone").setValue(inputAccount.getPhone());
        new Input(driver, "Fax").setValue(inputAccount.getFax());
        new Input(driver, "Website").setValue(inputAccount.getWebsite());
        //new InputComboBox(driver, "Type").selectByVisibleText(inputAccount.getType().getName());
        //new InputComboBox(driver, "Industry").selectByVisibleText(inputAccount.getIndustry().getName());
        new Input(driver, "Employees").setValue(inputAccount.getEmployees());
        new Input(driver, "Annual Revenue").setValue(inputAccount.getAnnualRevenue());
        new InputTextArea(driver, "Description").setValue(inputAccount.getDescription());
        new InputTextArea(driver, "Billing Street").setValue(inputAccount.getBillingStreet());
        new Input(driver, "Billing City").setValue(inputAccount.getBillingCity());
        new Input(driver, "Billing State/Province").setValue(inputAccount.getBillingState());
        new Input(driver, "Billing Zip/Postal Code").setValue(inputAccount.getBillingZipCode());
        new Input(driver, "Billing Country").setValue(inputAccount.getBillingCountry());
        new InputTextArea(driver, "Shipping Street").setValue(inputAccount.getShippingStreet());
        new Input(driver, "Shipping City").setValue(inputAccount.getShippingCity());
        new Input(driver, "Shipping State/Province").setValue(inputAccount.getShippingState());
        new Input(driver, "Shipping Zip/Postal Code").setValue(inputAccount.getShippingZipCode());
        new Input(driver, "Shipping Country").setValue(inputAccount.getShippingCountry());


    }


}
