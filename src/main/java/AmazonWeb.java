import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.junit.*;
import org.junit.Assert;

import java.util.concurrent.TimeUnit;

public class AmazonWeb {
    private WebDriver driver;

    public By searchField = By.id("twotabsearchtextbox");
    public By searchButton = By.id("nav-search-submit-button");

    public By productLocation = By.cssSelector("div[class='a-section aok-relative s-image-fixed-height']");

    public By addToCartButton = By.id("add-to-cart-button");

    public String addToCartSuccessText = "Added to Cart";

    public By addToCartSuccessElement = By.cssSelector("span[class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']");

    public By goToCartSuccessElement = By.id("attach-view-cart-button-form");

    public AmazonWeb(WebDriver driver){
        this.driver = driver;
    }

    public void clickOnElement(By elementPath){
        WebElement element = driver.findElement(elementPath);
        element.click();
    }

    public void sendKeysToTheElement(By elementPath, String keyText){
        WebElement element = driver.findElement(elementPath);
        element.sendKeys(keyText);
    }

    public void waitSeconds(long seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

    public String getTextOfAnElement (By elementPath){
        WebElement element = driver.findElement(addToCartSuccessElement);
        return element.getText();

    }

    public void validateIsEquals(String expectedCondition, String actualCondition)
    {
        Assert.assertEquals(expectedCondition,actualCondition);
    }


}
