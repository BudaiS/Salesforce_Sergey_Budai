package pages;

import elements.lead.LightningFormattedElement;
import enums.Industry;
import enums.Type;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountsDetailsPage extends BasePage {
    private final static By ICON_LOCATOR = By.xpath("//img[@title='Account']");
    private final static By ALERT_MESSAGE_LOCATOR = By.xpath("//div[@role='alertdialog']");


    public AccountsDetailsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAlertMessageDisplayed() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(ALERT_MESSAGE_LOCATOR));
        return driver.findElement(ALERT_MESSAGE_LOCATOR).isDisplayed();
    }

    @Override
    public void waitForPageLoaded() {
        waitForElementDisplayed(ICON_LOCATOR);

    }

    public Account getAccountInfo() {
        String accountName = new LightningFormattedElement(driver, "Account Name").getText();
        Account.AccountsBuilder accountsBuilder = new Account.AccountsBuilder(accountName);
        String fullBillingAddress = new LightningFormattedElement(driver, "Billing Address").getText();
        if (fullBillingAddress != "") {
            accountsBuilder.fullBillingAddress(fullBillingAddress);
        }
        String fullShippingAddress = new LightningFormattedElement(driver, "Shipping Address").getText();
        if (fullShippingAddress != "") {
            accountsBuilder.fullShippingAddress(fullShippingAddress);
        }
        String parentAccount = new LightningFormattedElement(driver, "Parent Account").getText();
        if (parentAccount != "") {
            accountsBuilder.parentAccount(parentAccount);
        }
        String phone = new LightningFormattedElement(driver, "Phone").getText();
        if (phone != "") {
            accountsBuilder.phone(phone);
        }
        String fax = new LightningFormattedElement(driver, "Fax").getText();
        if (fax != "") {
            accountsBuilder.fax(fax);
        }
        String website = new LightningFormattedElement(driver, "Website").getText();
        if (website != "") {
            accountsBuilder.website(website);
        }
        String type = new LightningFormattedElement(driver, "Type").getText();
        if (type != "") {
            accountsBuilder.type(Type.fromString(type));
        }
        String industry = new LightningFormattedElement(driver, "Industry").getText();
        if (industry != "") {
            accountsBuilder.industry(Industry.fromString(industry));
        }
        String description = new LightningFormattedElement(driver, "Description").getText();
        if (description != "") {
            accountsBuilder.description(description);
        }
        String employees = new LightningFormattedElement(driver, "Employees").getText();
        if (employees != "") {
            accountsBuilder.employees(employees);
        }
        String annualRevenue = new LightningFormattedElement(driver, "Annual Revenue").getText();
        if (annualRevenue != "") {
            accountsBuilder.annualRevenue(annualRevenue);
        }
        return accountsBuilder.build();

    }
}







