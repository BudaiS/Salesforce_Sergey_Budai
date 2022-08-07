package models;

import enums.Industry;
import enums.Type;

import java.util.Objects;

public class Account {
    private final String accountsName;


    private final String parentAccount;
    private final String phone;
    private final String fax;
    private final String website;
    private final Type type;
    private final Industry industry;
    private final String employees;
    private final String annualRevenue;
    private final String description;
    private final String billingStreet;
    private final String billingCity;
    private final String billingState;
    private final String billingZipCode;
    private final String billingCountry;
    private final String shippingStreet;
    private final String shippingCity;
    private final String shippingState;
    private final String shippingZipCode;
    private final String shippingCountry;
    private final String fullBillingAddress;
    private final String fullShippingAddress;

    private Account(AccountsBuilder accountsBuilder) {
        this.accountsName = accountsBuilder.accountsName;
        this.parentAccount = accountsBuilder.parentAccount;
        this.phone = accountsBuilder.phone;
        this.fax = accountsBuilder.fax;
        this.website = accountsBuilder.website;
        this.type = accountsBuilder.type;
        this.industry = accountsBuilder.industry;
        this.employees = accountsBuilder.employees;
        this.annualRevenue = accountsBuilder.annualRevenue;
        this.description = accountsBuilder.description;
        this.billingStreet = accountsBuilder.billingStreet;
        this.billingCity = accountsBuilder.billingCity;
        this.billingState = accountsBuilder.billingState;
        this.billingZipCode = accountsBuilder.billingZipCode;
        this.billingCountry = accountsBuilder.billingCountry;
        this.shippingStreet = accountsBuilder.shippingStreet;
        this.shippingCity = accountsBuilder.shippingCity;
        this.shippingState = accountsBuilder.shippingState;
        this.shippingZipCode = accountsBuilder.shippingZipCode;
        this.shippingCountry = accountsBuilder.shippingCountry;
        this.fullBillingAddress = accountsBuilder.fullBillingAddress;
        this.fullShippingAddress = accountsBuilder.fullShippingAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(accountsName, account.accountsName) && Objects.equals(parentAccount, account.parentAccount)
                && Objects.equals(phone, account.phone) && Objects.equals(fax, account.fax)
                && Objects.equals(website, account.website) && type == account.type && industry == account.industry
                && Objects.equals(employees, account.employees) && Objects.equals(annualRevenue, account.annualRevenue)
                && Objects.equals(description, account.description) && Objects.equals(billingStreet, account.billingStreet)
                && Objects.equals(billingCity, account.billingCity) && Objects.equals(billingState, account.billingState)
                && Objects.equals(billingZipCode, account.billingZipCode)
                && Objects.equals(billingCountry, account.billingCountry)
                && Objects.equals(shippingStreet, account.shippingStreet)
                && Objects.equals(shippingCity, account.shippingCity) && Objects.equals(shippingState, account.shippingState)
                && Objects.equals(shippingZipCode, account.shippingZipCode)
                && Objects.equals(shippingCountry, account.shippingCountry)
                && Objects.equals(fullBillingAddress, account.fullBillingAddress)
                && Objects.equals(fullShippingAddress, account.fullShippingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountsName, parentAccount, phone, fax, website, type, industry, employees, annualRevenue,
                description, billingStreet, billingCity, billingState, billingZipCode, billingCountry, shippingStreet,
                shippingCity, shippingState, shippingZipCode, shippingCountry, fullBillingAddress, fullShippingAddress);
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountsName='" + accountsName + '\'' +
                ", parentAccount='" + parentAccount + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", website='" + website + '\'' +
                ", type=" + type +
                ", industry=" + industry +
                ", employees='" + employees + '\'' +
                ", annualRevenue='" + annualRevenue + '\'' +
                ", description='" + description + '\'' +
                ", billingStreet='" + billingStreet + '\'' +
                ", billingCity='" + billingCity + '\'' +
                ", billingState='" + billingState + '\'' +
                ", billingZipCode='" + billingZipCode + '\'' +
                ", billingCountry='" + billingCountry + '\'' +
                ", shippingStreet='" + shippingStreet + '\'' +
                ", shippingCity='" + shippingCity + '\'' +
                ", shippingState='" + shippingState + '\'' +
                ", shippingZipCode='" + shippingZipCode + '\'' +
                ", shippingCountry='" + shippingCountry + '\'' +
                ", fullBillingAddress='" + fullBillingAddress + '\'' +
                ", fullShippingAddress='" + fullShippingAddress + '\'' +
                '}';
    }


    public String getAccountsName() {
        return accountsName;
    }

    public String getParentAccount() {
        return parentAccount;
    }

    public String getPhone() {
        return phone;
    }

    public String getFax() {
        return fax;
    }

    public String getWebsite() {
        return website;
    }

    public Type getType() {
        return type;
    }

    public Industry getIndustry() {
        return industry;
    }

    public String getEmployees() {
        return employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public String getDescription() {
        return description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public String getBillingZipCode() {
        return billingZipCode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public String getShippingZipCode() {
        return shippingZipCode;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }


    public String getFullBillingAddress() {
        if (this.fullBillingAddress != null) {
            return this.fullBillingAddress;
        } else {
            return (this.billingStreet + " " + this.billingCity + ", " + this.billingState + " " +
                    this.billingZipCode + " " + this.billingCountry).trim();
        }
    }

    public String getFullShippingAddress() {
        if (this.fullShippingAddress != null) {
            return this.fullShippingAddress;
        } else {
            return (this.shippingStreet + " " + this.shippingCity + ", " + this.shippingState + " " +
                    this.shippingZipCode + " " + this.shippingCountry).trim();
        }
    }


    public static class AccountsBuilder {

        private final String accountsName;
        private String parentAccount;
        private String phone;
        private String fax;
        private String website;
        private Type type;
        private Industry industry;
        private String employees;
        private String annualRevenue;
        private String description;
        private String billingStreet;
        private String billingCity;
        private String billingState;
        private String billingZipCode;
        private String billingCountry;
        private String shippingStreet;
        private String shippingCity;
        private String shippingState;
        private String shippingZipCode;
        private String shippingCountry;
        private String fullBillingAddress;
        private String fullShippingAddress;

        public AccountsBuilder(String accountsName) {
            this.accountsName = accountsName;
        }

        public AccountsBuilder parentAccount(String parentAccount) {
            this.parentAccount = parentAccount;
            return this;
        }

        public AccountsBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public AccountsBuilder fax(String fax) {
            this.fax = fax;
            return this;
        }

        public AccountsBuilder website(String website) {
            this.website = website;
            return this;
        }

        public AccountsBuilder type(Type type) {
            this.type = type;
            return this;
        }

        public AccountsBuilder industry(Industry industry) {
            this.industry = industry;
            return this;
        }

        public AccountsBuilder employees(String employees) {
            this.employees = employees;
            return this;
        }

        public AccountsBuilder annualRevenue(String annualRevenue) {
            this.annualRevenue = annualRevenue;
            return this;
        }

        public AccountsBuilder description(String description) {
            this.description = description;
            return this;
        }

        public AccountsBuilder billingStreet(String billingStreet) {
            this.billingStreet = billingStreet;
            return this;
        }

        public AccountsBuilder billingCity(String billingCity) {
            this.billingCity = billingCity;
            return this;
        }

        public AccountsBuilder billingState(String billingState) {
            this.billingState = billingState;
            return this;
        }

        public AccountsBuilder billingZipCode(String billingZipCode) {
            this.billingZipCode = billingZipCode;
            return this;
        }

        public AccountsBuilder billingCountry(String billingCountry) {
            this.billingCountry = billingCountry;
            return this;
        }

        public AccountsBuilder shippingStreet(String shippingStreet) {
            this.shippingStreet = shippingStreet;
            return this;
        }

        public AccountsBuilder shippingCity(String shippingCity) {
            this.shippingCity = shippingCity;
            return this;
        }

        public AccountsBuilder shippingState(String shippingState) {
            this.shippingState = shippingState;
            return this;
        }

        public AccountsBuilder shippingZipCode(String shippingZipCode) {
            this.shippingZipCode = shippingZipCode;
            return this;
        }

        public AccountsBuilder shippingCountry(String shippingCountry) {
            this.shippingCountry = shippingCountry;
            return this;
        }

        public AccountsBuilder fullBillingAddress(String fullBillingAddress) {
            this.fullBillingAddress = fullBillingAddress;
            return this;
        }

        public AccountsBuilder fullShippingAddress(String fullShippingAddress) {
            this.fullShippingAddress = fullShippingAddress;
            return this;
        }

        public Account build() {
            return new Account(this);
        }


    }


}
