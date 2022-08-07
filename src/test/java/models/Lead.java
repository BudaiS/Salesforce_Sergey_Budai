package models;

import enums.*;

import java.util.Objects;

public class Lead {
    private final Salutation salutation;
    private final String firstName;
    private final String lastName;
    private final String company;
    private final String title;
    private final LeadStatus leadStatus;
    private final String phone;
    private final String email;
    private final Rating rating;
    private final String street;
    private final String city;
    private final String state;
    private final String zipCode;
    private final String country;
    private final String website;
    private final String noOfEmployees;
    private final String annualRevenue;
    private final LeadSource leadSource;
    private final Industry industry;
    private final String description;
    private final String fullName;
    private final String fullAddress;


    private Lead(LeadBuilder leadBuilder) {
        this.salutation = leadBuilder.salutation;
        this.firstName = leadBuilder.firstName;
        this.lastName = leadBuilder.lastName;
        this.company = leadBuilder.company;
        this.title = leadBuilder.title;
        this.leadStatus = leadBuilder.leadStatus;
        this.phone = leadBuilder.phone;
        this.email = leadBuilder.email;
        this.rating = leadBuilder.rating;
        this.street = leadBuilder.street;
        this.city = leadBuilder.city;
        this.state = leadBuilder.state;
        this.zipCode = leadBuilder.zipCode;
        this.country = leadBuilder.country;
        this.website = leadBuilder.website;
        this.noOfEmployees = leadBuilder.noOfEmployees;
        this.annualRevenue = leadBuilder.annualRevenue;
        this.leadSource = leadBuilder.leadSource;
        this.industry = leadBuilder.industry;
        this.description = leadBuilder.description;
        this.fullName = leadBuilder.fullName;
        this.fullAddress = leadBuilder.fullAddress;


    }

    @Override
    public String toString() {
        return "Lead{" +
                "salutation=" + salutation +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", company='" + company + '\'' +
                ", title='" + title + '\'' +
                ", leadStatus=" + leadStatus +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", rating=" + rating +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", country='" + country + '\'' +
                ", website='" + website + '\'' +
                ", noOfEmployees='" + noOfEmployees + '\'' +
                ", annualRevenue='" + annualRevenue + '\'' +
                ", leadSource=" + leadSource +
                ", industry=" + industry +
                ", description='" + description + '\'' +
                ", fullName='" + fullName + '\'' +
                ", fullAddress='" + fullAddress + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lead lead = (Lead) o;
        return salutation == lead.salutation && Objects.equals(firstName, lead.firstName) &&
                Objects.equals(lastName, lead.lastName) && Objects.equals(company, lead.company) &&
                Objects.equals(title, lead.title) && leadStatus == lead.leadStatus && Objects.equals(phone, lead.phone) &&
                Objects.equals(email, lead.email) && rating == lead.rating && Objects.equals(street, lead.street) &&
                Objects.equals(city, lead.city) && Objects.equals(state, lead.state) && Objects.equals(zipCode, lead.zipCode) &&
                Objects.equals(country, lead.country) && Objects.equals(website, lead.website) &&
                Objects.equals(noOfEmployees, lead.noOfEmployees) && Objects.equals(annualRevenue, lead.annualRevenue) &&
                leadSource == lead.leadSource && industry == lead.industry && Objects.equals(description, lead.description) &&
                Objects.equals(fullName, lead.fullName) && Objects.equals(fullAddress, lead.fullAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salutation, firstName, lastName, company, title, leadStatus, phone, email, rating, street, city,
                state, zipCode, country, website, noOfEmployees, annualRevenue, leadSource, industry, description,
                fullName, fullAddress);
    }


    public String getFullName() {
        if (this.fullName != null) {
            return this.fullName;
        } else {
            return (this.salutation.getName() + " " + this.firstName + " " + this.lastName).trim();
        }
    }

    public String getFullAddress() {
        if (this.fullAddress != null) {
            return this.fullAddress;
        } else {
            return (this.street + "\n" + this.city + ", " + this.state + " " + this.zipCode + "\n" + this.country).trim();
        }
    }


    public Salutation getSalutation() {
        return salutation;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompany() {
        return company;
    }

    public String getTitle() {
        return title;
    }

    public LeadStatus getLeadStatus() {
        return leadStatus;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Rating getRating() {
        return rating;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCountry() {
        return country;
    }

    public String getWebsite() {
        return website;
    }

    public String getNoOfEmployees() {
        return noOfEmployees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public LeadSource getLeadSource() {
        return leadSource;
    }

    public Industry getIndustry() {
        return industry;
    }

    public String getDescription() {
        return description;
    }

    public static class LeadBuilder {

        private final String company;
        private final LeadStatus leadStatus;
        private Salutation salutation;
        private String firstName;
        private String lastName;
        private String title;
        private String phone;
        private String email;
        private Rating rating;
        private String street;
        private String city;
        private String state;
        private String zipCode;
        private String country;
        private String website;
        private String noOfEmployees;
        private String annualRevenue;
        private LeadSource leadSource;
        private Industry industry;
        private String description;
        private String fullName;
        private String fullAddress;


        public LeadBuilder(String company, LeadStatus leadStatus) {
            this.company = company;
            this.leadStatus = leadStatus;
        }

        public LeadBuilder fullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public LeadBuilder fullAddress(String fullAddress) {
            this.fullAddress = fullAddress;
            return this;
        }


        public LeadBuilder street(String street) {
            this.street = street;
            return this;
        }


        public LeadBuilder city(String city) {
            this.city = city;
            return this;
        }

        public LeadBuilder state(String state) {
            this.state = state;
            return this;
        }

        public LeadBuilder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public LeadBuilder country(String country) {
            this.country = country;
            return this;
        }

        public LeadBuilder website(String website) {
            this.website = website;
            return this;
        }

        public LeadBuilder noOfEmployees(String noOfEmployees) {
            this.noOfEmployees = noOfEmployees;
            return this;
        }

        public LeadBuilder annualRevenue(String annualRevenue) {
            this.annualRevenue = annualRevenue;
            return this;
        }

        public LeadBuilder leadSource(LeadSource leadSource) {
            this.leadSource = leadSource;
            return this;
        }

        public LeadBuilder industry(Industry industry) {
            this.industry = industry;
            return this;
        }

        public LeadBuilder description(String description) {
            this.description = description;
            return this;
        }

        public LeadBuilder salutation(Salutation salutation) {
            this.salutation = salutation;
            return this;
        }

        public LeadBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public LeadBuilder title(String title) {
            this.title = title;
            return this;
        }

        public LeadBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public LeadBuilder email(String email) {
            this.email = email;
            return this;
        }

        public LeadBuilder rating(Rating rating) {
            this.rating = rating;
            return this;
        }

        public LeadBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Lead build() {
            return new Lead(this);
        }


    }


}
