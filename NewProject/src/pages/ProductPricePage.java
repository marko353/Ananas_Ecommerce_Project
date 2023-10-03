package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;

public class ProductPricePage extends BasePage {

    public ProductPricePage(WebDriver driver) {
        super(driver);

    }

    By priceTire = By.cssSelector("span.sc-1arj7wv-2.cwZZG");
    By saleButton = By.xpath("//a[@href='/akcija']");
    By productTShirt = By.xpath("/html/body/div/div[3]/div[2]/div/div[3]/div[2]/ul/li[10]/div/a/div/div[2]/h3");
    By clickAddToCart = By.xpath("/html/body/div/div[3]/div[2]/div[2]/div[3]/div[1]/div[5]/div[1]/div/div/div[3]/button");
    By buttonLookInCart = By.xpath("//button[contains(@class, 'sc-1vt7mai-0') and contains(@class, 'kYiuod') and contains(text(), 'Pregledaj korpu')]");
    By removeProductButton = By.xpath("//button[contains(text(), 'Ukloni proizvod')]");
    By productPrice = By.xpath("//span[@class='sc-1arj7wv-2 cwZZG'][contains(text(), '2.519,00')]");
    By shippingPrice = By.xpath("//span[@class='sc-1arj7wv-2 cwZZG'][contains(text(), '349,00')]");
    By removeSecoundP = By.xpath("//button[@class='sc-1w53mup-1 kvzxfF']");
    By clickSalt = By.xpath("//img[@alt='LAMART Šolje za kafu LT9034 2/1']");
    By addSaltInCart = By.cssSelector("button.sc-1pmeklq-0");
    By lookInCart = By.xpath("/html/body/div[2]/div[3]/div[1]/button[1]");
    By secoundProduct = By.cssSelector("img[alt=\"PETLAS Zimska guma 275/45 R20 110V za džip\"]");
    By priceTwoProduct = By.xpath("//span[@class='sc-1arj7wv-2 cwZZG'][contains(text(), '32.101,00')]");
    By addToCart = By.cssSelector("button.sc-1vt7mai-0.sc-1pmeklq-0.ddzlTv.irGVHj");
   

    public ProductPricePage priceOfTheTire(String expectedPrice) {
        assertTextEquals(expectedPrice, priceTire);
        return this;

    }

    public ProductPricePage clickSaleButton() {
        click(saleButton);
        return this;

    }

    public ProductPricePage clickOnTShirtProduck() {
        click(productTShirt);
        return this;

    }

    public ProductPricePage clickOnAddProductInCart() {
        click(clickAddToCart);
        return this;

    }

    public ProductPricePage lookInCartButton() {
        click(buttonLookInCart);
        return this;

    }

    public ProductPricePage removeProductFromCart() {
      
        click(removeProductButton);
        
        return this;

    }
    public ProductPricePage verifyTotalPrice(double actualPrice) {
        String productPriceText = driver.findElement(productPrice).getText();
        productPriceText = productPriceText.replace(",", "").replace(".", "");
        double productPrice = Double.parseDouble(productPriceText) / 100; 
        String shippingPriceText = driver.findElement(shippingPrice).getText();
        shippingPriceText = shippingPriceText.replace(",", "").replace(".", "");
        double shippingPrice = Double.parseDouble(shippingPriceText) / 100; 
        double expectedPrice = productPrice + shippingPrice;
        Assert.assertEquals(expectedPrice, actualPrice, 0.01);
        
        return this;
    }
    
     public ProductPricePage clickOnCoffeeSalt() {
        click(clickSalt);
        return this;

    }
      public ProductPricePage clickOnAddToCart() {
        click(addSaltInCart);
        return this;

    }
       public ProductPricePage clickOnLookInToCart() {
        click(lookInCart);
        return this;

    }
      public ProductPricePage clickAnotherProduct() {
        click(secoundProduct);
        return this;

    }
  public ProductPricePage assertPriceTwoProducts(String expectedText) {
    WebElement priceElement = driver.findElement(priceTwoProduct);
    String actualText = priceElement.getText();
    Assert.assertEquals(expectedText, actualText);
    return this;
}
       public ProductPricePage clicToAddToCArt() {
        click(addToCart);
        return this;

    }
  
   
    
    
  
    
    

}
