package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    By prijaviSe = By.cssSelector(".sc-1rhklln-0.gIUtAK");
    By closePopupMassage = By.cssSelector(".sc-1g8a1a2-6");
    By createAnAccount = By.cssSelector("span.sc-79pcpx-0:nth-child(2)");
    By emailField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("login-submit");
    By username = By.cssSelector("span.sc-79pcpx-0.ieekjL");
    By errorEmailMessage = By.cssSelector("p.sc-79pcpx-0.sc-145m2xt-2.exlgLw.bxHxmt");
    By errorPassMessage =  By.cssSelector("p.sc-79pcpx-0.sc-145m2xt-2.exlgLw.bxHxmt");
    By forgotPassword = By.xpath("/html/body/div/div[3]/div[2]/div/div/section/form/div[3]/a");
    By frgotEmailField = By.id("email");
    By sendButton = By.id("login-submit");
    By successfulSendMesage = By.cssSelector("p.sc-79pcpx-0.iWkMJA");
    By buttonSee = By.cssSelector("svg.MuiSvgIcon-root.sc-15dudh8-1.dDphki");

    public LoginPage clearCookies() {

        click(prijaviSe);
        return this;
    }

    public LoginPage clearPopupMassage() {
        click(closePopupMassage);
        return this;
    }

    public LoginPage clickOnSignUp() {
        click(createAnAccount);
        return this;

    }

    public LoginPage email(String text) {
        writeText(emailField, text);
        return this;
    }
    
    public LoginPage password(String text) {
        writeText(passwordField, text);
        return this;
    }
    public LoginPage clickLoginButton() {
        click(loginButton);
        return this;
}
public LoginPage verifyUserName(String expected){
    assertTextEquals(expected, username);
    return this;
}
public LoginPage wrongEmailMessage(String expected){
    assertTextEquals(expected, errorEmailMessage);
    return this;
}
public LoginPage wrongPasswordMessage(String expected){
    assertTextEquals(expected, errorPassMessage);
    return this;
}
public LoginPage forgotPasswordButton(){
    click(forgotPassword);
    return this;
}
   public LoginPage enterForgotEmail(String text) {
        writeText(frgotEmailField, text);
        return this;
    }
    public LoginPage clickForgotButton(){
        click(sendButton);
        return this;
    }
    public LoginPage verifySuccessfullSendEmailLink(String expected){
    assertTextEquals(expected, successfulSendMesage);
    return this;
}
  public LoginPage seeButtonClick() {
        click(buttonSee);
        return this;

    }
  public LoginPage verifyThatPasswordIsShow() {
    WebElement passwordFieldElement = driver.findElement(passwordField);

    String passwordFieldType = passwordFieldElement.getAttribute("type");
    if (passwordFieldType.equals("text")) {
        System.out.println("The password is now displayed");
    } else {
        System.out.println("Password not displayed");
    }

    return this;
}

    
        
    }


