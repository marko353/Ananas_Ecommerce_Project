package tests;

import org.junit.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void verfySuccessfullyLogin() {
        LoginPage loginPage = new LoginPage(driver);

        String mail = "markostojanovic353@gmail.com";
        String password = "Test123!";
        String nameUser = "marko";

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        loginPage.email(mail);
        loginPage.password(password);
        loginPage.clickLoginButton();
        loginPage.verifyUserName(nameUser);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void verfyunSuccessfullyLoginWrongEmail() {
        LoginPage loginPage = new LoginPage(driver);

        String mail = "mmarkostojanovic353@gmail.com";
        String password = "Test123!";
        String expectedWrongEmailMessage = "Email ili lozinka nisu u redu.";

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        loginPage.email(mail);
        loginPage.password(password);
        loginPage.clickLoginButton();
        loginPage.wrongEmailMessage(expectedWrongEmailMessage);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void verfyunSuccessfullyLoginWrongPassword() {
        LoginPage loginPage = new LoginPage(driver);

        String mail = "markostojanovic353@gmail.com";
        String password = "test!!!!!";
        String expectedWrongEmailMessage = "Email ili lozinka nisu u redu.";

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        loginPage.email(mail);
        loginPage.password(password);
        loginPage.clickLoginButton();
        loginPage.wrongPasswordMessage(expectedWrongEmailMessage);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void forgotPasswordSendLink() {
        LoginPage loginPage = new LoginPage(driver);

        String mail = "markostojanovic353@gmail.com";
        String password = "test!!!!!";
        String messageText = "Poslat vam je link za izmenu lozinke u slučaju da email adresa markostojanovic353@gmail.com već postoji u sistemu.";

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        loginPage.email(mail);
        loginPage.password(password);
        loginPage.forgotPasswordButton();
        loginPage.enterForgotEmail(mail);
        loginPage.clickForgotButton();
        loginPage.verifySuccessfullSendEmailLink(messageText);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void seeButtonShowPassword() {
        LoginPage loginPage = new LoginPage(driver);

        String mail = "markostojanovic353@gmail.com";
        String password = "Test!!!!!";

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        loginPage.email(mail);
        loginPage.password(password);
        loginPage.seeButtonClick();
        loginPage.verifyThatPasswordIsShow();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}