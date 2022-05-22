import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class AmazonWebTest extends BaseTest
{

    @Test
    public void amazonWebEndtoEnd() throws InterruptedException {

        //arama alanına tıklanır
        amazonWeb.clickOnElement(amazonWeb.searchField);

        //arama alanına computer yazılır
        amazonWeb.sendKeysToTheElement(amazonWeb.searchField, "computer");

        //5 sn bekletilir
        amazonWeb.waitSeconds(5);

        //ara butonuna tıklanır
        amazonWeb.clickOnElement(amazonWeb.searchButton);

        //5 sn bekletilir
        amazonWeb.waitSeconds(5);

        //ilk ürünün görseline tıklanır
        amazonWeb.clickOnElement(amazonWeb.productLocation);

        //5 sn bekletilir
        amazonWeb.waitSeconds(5);

        //sepete ekle butonuna tıklanır
        amazonWeb.clickOnElement(amazonWeb.addToCartButton);

        //5 sn bekletilir
        amazonWeb.waitSeconds(5);

        //sepete eklendi mi text ile kontrol et
        amazonWeb.validateIsEquals(amazonWeb.getTextOfAnElement(amazonWeb.addToCartSuccessElement),amazonWeb.addToCartSuccessText);

        //5 sn bekletilir
        amazonWeb.waitSeconds(5);

        amazonWeb.clickOnElement(amazonWeb.goToCartSuccessElement);


    }
}
