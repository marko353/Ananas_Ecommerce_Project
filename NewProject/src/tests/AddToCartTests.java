package tests;

import org.junit.Test;

import pages.AddToCartPage;
import pages.LoginPage;

public class AddToCartTests extends BaseTest {

    @Test
    public void verifyThatProductIsVisibleInCart() {
        LoginPage loginPage = new LoginPage(driver);
        AddToCartPage addToCartPage = new AddToCartPage(driver);

        String mail = "markostojanovic353@gmail.com";
        String password = "Test123!";

       loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        loginPage.email(mail);
        loginPage.password(password);
        loginPage.clickLoginButton();
        addToCartPage.clickOnCarTiresButton();
        addToCartPage.clickOnImageElement();
        addToCartPage.addToCartButton();
        addToCartPage.clickCheckCartButton();
        addToCartPage.verifyThatProductIsVisible();
        addToCartPage.removeProductFromCart();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void verifyThatProductNameIsVisibleInCart() {
        LoginPage loginPage = new LoginPage(driver);
        AddToCartPage addToCartPage = new AddToCartPage(driver);

        String mail = "markostojanovic353@gmail.com";
        String password = "Test123!";
        String productName = "PETLAS Zimska guma 275/40 R20 106V za džip";

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        loginPage.email(mail);
        loginPage.password(password);
        loginPage.clickLoginButton();
        addToCartPage.clickOnCarTiresButton();
        addToCartPage.clickOnImageElement();
        addToCartPage.addToCartButton();
        addToCartPage.clickCheckCartButton();
        addToCartPage.verifyThatProductNameIsVisible(productName);
        addToCartPage.removeProductFromCart();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void verifyInstallmentAmount() {
        LoginPage loginPage = new LoginPage(driver);
        AddToCartPage addToCartPage = new AddToCartPage(driver);

        String mail = "markostojanovic353@gmail.com";
        String password = "Test123!";
        String amontPrice = "Iznos rate: 2700 RSD";

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        loginPage.email(mail);
        loginPage.password(password);
        loginPage.clickLoginButton();
        addToCartPage.clickOnCarTiresButton();
        addToCartPage.clickOnImageElement();
        addToCartPage.installmentAmountPrice(amontPrice);

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void verifyThatProductCanBeRemovedFromCart() {
        LoginPage loginPage = new LoginPage(driver);
        AddToCartPage addToCartPage = new AddToCartPage(driver);

        String mail = "markostojanovic353@gmail.com";
        String password = "Test123!";
      

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        loginPage.email(mail);
        loginPage.password(password);
        loginPage.clickLoginButton();
        addToCartPage.clickOnCarTiresButton();
        addToCartPage.clickOnImageElement();
        addToCartPage.addToCartButton();
        addToCartPage.clickCheckCartButton();
        addToCartPage.removeProductFromCart();
        addToCartPage.productIsRemovedFromCart();
          try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
      @Test
    public void verifyMaximumNumberOfProducts() {
        LoginPage loginPage = new LoginPage(driver);
        AddToCartPage addToCartPage = new AddToCartPage(driver);

        String mail = "markostojanovic353@gmail.com";
        String password = "Test123!";
        String expectedMessage = "Izabran maksimalan broj proizvoda";

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        loginPage.email(mail);
        loginPage.password(password);
        loginPage.clickLoginButton();
        addToCartPage.clickOnCarTiresButton();
        addToCartPage.clickOnImageElement();
        addToCartPage.maximumNumberOfProduct();
        addToCartPage.verifyErrorMessageMaximumNumberOfProdicts(expectedMessage);
        addToCartPage.addToCartButton();
        addToCartPage.clickCheckCartButton();
        addToCartPage.removeProductFromCart();
      
     
          try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
