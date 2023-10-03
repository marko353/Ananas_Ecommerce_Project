package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);

    }
    By seachField = By.className("aa-Input");
    By searchButton = By.cssSelector("button[aria-label='Search']");
    By menuAllCategoriesClick = By.xpath("/html/body/div/div[3]/header/div[4]/div/section/div/nav/ul/li[1]/button/span");
    By actualTabs = By.cssSelector(".sc-79pcpx-0.sc-nb5rcz-0.eQGKA.KqKHS");
 
    public HomePage visibleLogo() {
        WebElement logoElement = driver.findElement(By.cssSelector("img[src*='ananas-logo-icon']"));

        if (logoElement.isDisplayed()) {
            System.out.println("Logo is displayed");
        } else {
            System.out.println("logo is not visible");
        }

        return null;

    }
    public HomePage enterTextInSearchField(String text){
        writeText(seachField, text);
        return this;
    }
    public HomePage clickSearch(){
        click(searchButton);
        return this;
    }
    public HomePage verifyUrlAddress(){
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("https://ananas.rs/search?query=Gume")) {
            System.out.println("The search works and leads to the results page.");
        } else {
            System.out.println("The search does not work or does not lead to the appropriate page.");
        }
        return this;
        
    }
    public HomePage dropDownMenu(){
        click(menuAllCategoriesClick);
        return this;
    }
    public HomePage numberOfTabs(int expectedNumberOfProducts) {

        int actualNumberOfProducts = countItems(actualTabs);
        assertIntigerEquals(expectedNumberOfProducts, actualNumberOfProducts);
        return this;
    }
    private void assertIntigerEquals(int expectedNumberOfProducts, int actualNumberOfProducts) {
    }

}
