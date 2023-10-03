package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage extends BasePage {

  public RegistrationPage(WebDriver driver) {
    super(driver);

  }

  
  By registerButton = By.cssSelector(".hfWjck");
  By emailField = By.id("email");
  By firstNameField = By.id("firstName");
  By lastNameField = By.id("lastName");
  By passwordField = By.cssSelector("div.sc-iw5ijy-1:nth-child(6) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)");
  By agreeButton = By.xpath("/html/body/div/div[3]/div[2]/div/div/form/div[7]/span/span/span[1]");
  By buttonRegistration = By.xpath("/html/body/div/div[3]/div[2]/div/div/form/button[1]");
  By actualValue = By.xpath("//h3[text()='Odlično']");
  By actualValueShortPassword = By.xpath("/html/body/div/div[3]/div[2]/div/div/form/div[4]/div/p");
  By emailIncorrect = By.xpath("/html/body/div/div[3]/div[2]/div/div/form/div[1]/div/p");
  By duplicateEmail = By.xpath("//p[text()='Email je zauzet.']");
  By disabledRegisterButton = By.cssSelector("button[disabled].sc-1vt7mai-0.gZLqBM");




  public RegistrationPage clickRegister() {
    click(registerButton);
    return this;
  }

  public RegistrationPage mailField(String email) {
    writeText(emailField, email);
    return this;
  }

  public RegistrationPage firstNameField(String email) {
    writeText(firstNameField, email);
    return this;
  }

  public RegistrationPage lasttNameField(String email) {
    writeText(lastNameField, email);
    return this;
  }

  public RegistrationPage passwordField(String email) {
    writeText(passwordField, email);
    return this;
  }

  public RegistrationPage IAgree() {
    click(agreeButton);
    return this;
  }

  public RegistrationPage registrationButton() {
    click(buttonRegistration);
    return this;
  }

  public RegistrationPage verificationEmailMessage(String expected) {
    assertTextEquals(expected, actualValue);
    return this;
  }

  public RegistrationPage errorMessageShortPassword(String expected) {
    assertTextEquals(expected, actualValueShortPassword);
    return this;

  }
   public RegistrationPage incorrectEmailAddressMessageInvaliData(String expected) {
    assertTextEquals(expected, emailIncorrect);
    return this;

  }
    public RegistrationPage duplicateEmailErrorMessage (String expected) {
    assertTextEquals(expected, duplicateEmail);
    return this;

  }
  public boolean isRegisterButtonDisabled() {
    WebElement registerButtonElement = driver.findElement(disabledRegisterButton);
    return !registerButtonElement.isEnabled();
}


}
