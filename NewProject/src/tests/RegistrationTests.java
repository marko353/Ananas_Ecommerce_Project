package tests;

import java.util.UUID;

import org.junit.Assert;
import org.junit.Test;

import pages.LoginPage;
import pages.RegistrationPage;

public class RegistrationTests extends BaseTest {

    @Test
    public void successfullyRegistration() {
        String firstName = "Marko";
        String lastName = "Stojanovic";
        String password = "Test123!";
        String randomEmail = UUID.randomUUID().toString() + "@test.com";
        String expectedValue = "Odlično";

        RegistrationPage registrationPage = new RegistrationPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        registrationPage.clickRegister();
        registrationPage.mailField(randomEmail);
        registrationPage.firstNameField(firstName);
        registrationPage.lasttNameField(lastName);
        registrationPage.passwordField(password);
        registrationPage.IAgree();
        registrationPage.registrationButton();
        registrationPage.verificationEmailMessage(expectedValue);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test

    public void verifyTooShortPasswordMessage() {
        String firstName = "Marko";
        String lastName = "Stojanovic";
        String badPassword = "Test";
        String randomEmail = UUID.randomUUID().toString() + "@test.com";
        String shortPassword = "Minimum 8 karaktera.";

        RegistrationPage registrationPage = new RegistrationPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        registrationPage.clickRegister();
        registrationPage.mailField(randomEmail);
        registrationPage.firstNameField(firstName);
        registrationPage.lasttNameField(lastName);
        registrationPage.passwordField(badPassword);
        registrationPage.IAgree();
        registrationPage.registrationButton();
        registrationPage.errorMessageShortPassword(shortPassword);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifyIncorrectEmailMessageInvaliData() {
        String firstName = "Marko";
        String lastName = "Stojanovic";
        String badPassword = "Test123!";
        String incorrectEmail = "test gmail.com";
        String errorMessageIncorrectEmail = "Email adresa nije ispravna.";

        RegistrationPage registrationPage = new RegistrationPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        registrationPage.clickRegister();
        registrationPage.mailField(incorrectEmail);
        registrationPage.firstNameField(firstName);
        registrationPage.lasttNameField(lastName);
        registrationPage.passwordField(badPassword);
        registrationPage.IAgree();
        registrationPage.registrationButton();
        registrationPage.incorrectEmailAddressMessageInvaliData(errorMessageIncorrectEmail);
    }

    @Test
    public void duplicateEmailAddresses() {
        String firstName = "Marko";
        String lastName = "Stojanovic";
        String duplicateEmail = "markostojanovic353@gmail.com";
        String password = "Test123!";
        String errorMessageDulicate = "Email je zauzet.";

        RegistrationPage registrationPage = new RegistrationPage(driver);
        LoginPage loginPage = new LoginPage(driver);

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        registrationPage.clickRegister();
        registrationPage.mailField(duplicateEmail);
        registrationPage.firstNameField(firstName);
        registrationPage.lasttNameField(lastName);
        registrationPage.passwordField(password);
        registrationPage.IAgree();
        registrationPage.registrationButton();
        registrationPage.duplicateEmailErrorMessage(errorMessageDulicate);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void verifyRegisterButtonIsDisabledWhenMandatoryFieldsAreNotFilled() {

        String firstName = "Marko";
        String lastName = "Stojanovic";
        String randomEmail = UUID.randomUUID().toString() + "@test.com";
        RegistrationPage registrationPage = new RegistrationPage(driver);
        LoginPage loginPage = new LoginPage(driver);
       
        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        registrationPage.clickRegister();
        registrationPage.mailField(randomEmail);
        registrationPage.firstNameField(firstName);
        registrationPage.lasttNameField(lastName);

        boolean isRegisterButtonDisabled = registrationPage.isRegisterButtonDisabled();
        Assert.assertTrue("Dugme za registraciju treba da bude onemogućeno kada nisu popunjena obavezna polja.",
                isRegisterButtonDisabled);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
