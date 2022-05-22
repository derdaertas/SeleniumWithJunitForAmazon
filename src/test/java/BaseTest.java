import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)

public class BaseTest {

    protected WebDriver driver;
    AmazonWeb amazonWeb;

    @BeforeAll
    public void setUp()
    {
        System.out.println("Driver ayağa kaldırılıyor...");
        System.setProperty("webdriver.gecko.driver","src/drivers/geckodriver");
        driver = new FirefoxDriver();
        System.out.println("Driver ayağa kaldırıldı.");

        amazonWeb = new AmazonWeb(driver);

        driver.get("https://www.amazon.com/");
        System.out.println("Amazon Web Sayfası açıldı.");
    }

    @AfterAll
    public void tearDown()
    {
        driver.quit();
        System.out.println("Driver kapatıldı.");
    }

}
