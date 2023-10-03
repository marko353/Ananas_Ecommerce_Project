package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToCartPage extends BasePage {

    public AddToCartPage(WebDriver driver) {
        super(driver);

    }

    By tiresButton = By.cssSelector("a[href='/kategorije/auto-i-moto/gume/zimske-gume']");
    By imageElement = By.xpath("/html/body/div/div[3]/div[2]/div/div[3]/div[2]/ul/li[1]/div/a/div/div[2]/h3");
    By addToCartButton = By.xpath("/html/body/div/div[3]/div[2]/div[2]/div[3]/div[1]/div[5]/div[1]/div/div/div[3]/button");
    By checkCartButton = By.xpath("//button[@class='sc-1vt7mai-0 kYiuod']");
    By firstProduct = By.xpath("/html/body/div/div[3]/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/img");
    By productName = By.cssSelector("a.sc-180pjr6-0.gZlFpg");
    By removeProductButton = By.xpath("//button[contains(text(), 'Ukloni proizvod')]");
    By priceTire = By.cssSelector("span.sc-1arj7wv-2.cwZZG");
    By installmentAmount = By.cssSelector("p.sc-79pcpx-0.sc-10ck7rv-1.eQGKA.gSEZT");
    By removeProduct = By.cssSelector("button.sc-1w53mup-1 kvzxfF");
    By addProduct = By.cssSelector("button.sc-1d0ny8j-2:nth-child(3) > span:nth-child(1) > svg:nth-child(1)");
    By messageElement = By.cssSelector("div.sc-r7kari-4.kSANKE");
    By remouveSecoundProduct = By.cssSelector(".sc-1w53mup-1");

    public AddToCartPage scrollToElement() {

        Actions actions = new Actions(driver);
        waitForVisibility(tiresButton);
        WebElement elementToScrollTo = driver.findElement(tiresButton);
        actions.moveToElement(elementToScrollTo).perform();

        return this;

    }

    public AddToCartPage clickOnCarTiresButton() {
        click(tiresButton);
        return this;

    }

    public AddToCartPage clickOnImageElement() {
        click(imageElement);
        return this;

    }

    public AddToCartPage addToCartButton() {
        click(addToCartButton);
        return this;

    }

    public AddToCartPage clickCheckCartButton() {
        click(checkCartButton);
        return this;

    }

    public AddToCartPage verifyThatProductIsVisible() {
        assertElementIsVisible(firstProduct);
        return this;

    }

    public AddToCartPage verifyThatProductNameIsVisible(String expected) {
        assertTextEquals(expected, productName);
        return this;

    }

    public AddToCartPage removeProductFromCart() {
        click(removeProductButton);
        return this;
    }

    public AddToCartPage installmentAmountPrice(String expected) {
        assertTextEquals(expected, installmentAmount);
        return this;

    }

    public AddToCartPage removeProduct() {
        click(removeProduct);
        return this;

    }

    public AddToCartPage productIsRemovedFromCart() {
        boolean isProductInCartInvisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(imageElement));
        Assert.assertTrue("The product is still visible in the cart", isProductInCartInvisible);

        return this;

    }

    public AddToCartPage maximumNumberOfProduct() {
        for (int i = 0; i < 6; i++) {
            click(addProduct);
        }
        return this;
    }

    public AddToCartPage verifyErrorMessageMaximumNumberOfProdicts(String expected) {
        assertTextEquals(expected, messageElement);
        return this;

    }
   

    public AddToCartPage removeSecoundProductFromCart() {
        click(remouveSecoundProduct);
        return this;

    }
    
}
