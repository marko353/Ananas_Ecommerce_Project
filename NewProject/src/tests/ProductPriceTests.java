package tests;

import org.junit.Test;

import pages.AddToCartPage;
import pages.LoginPage;
import pages.ProductPricePage;

public class ProductPriceTests extends BaseTest {

    @Test
    public void verifyThatPriceOfTire() {
        LoginPage loginPage = new LoginPage(driver);
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        ProductPricePage productPricePage = new ProductPricePage(driver);
        String mail = "markostojanovic353@gmail.com";
        String password = "Test123!";
        String tirePrice = "16.133,00";

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
        productPricePage.priceOfTheTire(tirePrice);
        addToCartPage.removeProductFromCart();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void verifyTotalPriceOfTShirt() {
        LoginPage loginPage = new LoginPage(driver);
        ProductPricePage productPricePage = new ProductPricePage(driver);
        String mail = "markostojanovic353@gmail.com";
        String password = "Test123!";
        double totalPrice = 2868.0;
        
        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        loginPage.email(mail);
        loginPage.password(password);
        loginPage.clickLoginButton();
        productPricePage.clickSaleButton();
        productPricePage.clickOnTShirtProduck();
        productPricePage.clickOnAddProductInCart();
        productPricePage.lookInCartButton();
        productPricePage.verifyTotalPrice(totalPrice);
        productPricePage.removeProductFromCart();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
      @Test
    public void verifyPriceTwoProducts() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        ProductPricePage productPricePage = new ProductPricePage(driver);
        String mail = "markostojanovic353@gmail.com";
        String password = "Test123!";
        String twoProductsPrice = "32.101,00";

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
        driver.navigate().back();
        productPricePage.clickAnotherProduct();
        productPricePage.clicToAddToCArt();
        addToCartPage.clickCheckCartButton();
        productPricePage.assertPriceTwoProducts(twoProductsPrice);
        addToCartPage.removeProductFromCart();
        Thread.sleep(3000);
        addToCartPage.removeSecoundProductFromCart();
        
        
          try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
}
}

