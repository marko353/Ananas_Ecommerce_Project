package tests;

import org.junit.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomeTests extends BaseTest{

     @Test
    public void verifyThatTheLogoIsVisible() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage= new HomePage(driver);
        
        String mail = "markostojanovic353@gmail.com";
        String password = "Test123!";
        

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        loginPage.email(mail);
        loginPage.password(password);
        loginPage.clickLoginButton();
        homePage.visibleLogo();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
}
     @Test
    public void searchFieldReturnsTheCorrectResults() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage= new HomePage(driver);
        
        String mail = "markostojanovic353@gmail.com";
        String password = "Test123!";
        String searchText = "Gume";

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        loginPage.email(mail);
        loginPage.password(password);
        loginPage.clickLoginButton();
        homePage.enterTextInSearchField(searchText);
        homePage.clickSearch();
        homePage.verifyUrlAddress();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
}
    @Test
    public void verifyThatTheAllCategoriesDropdownMenuIsWorkingProperly() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage= new HomePage(driver);
        
        String mail = "markostojanovic353@gmail.com";
        String password = "Test123!";
        

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        loginPage.email(mail);
        loginPage.password(password);
        loginPage.clickLoginButton();
        homePage.dropDownMenu();
   
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
}
        @Test
    public void verifyNumberOfTabsInDropdownMenu() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage= new HomePage(driver);
        
        String mail = "markostojanovic353@gmail.com";
        String password = "Test123!";
        int tabsNumber = 14;

        loginPage.openBaseURL();
        loginPage.clearCookies();
        loginPage.clearPopupMassage();
        loginPage.clickOnSignUp();
        loginPage.email(mail);
        loginPage.password(password);
        loginPage.clickLoginButton();
        homePage.dropDownMenu();
        homePage.numberOfTabs(tabsNumber);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
}
}
