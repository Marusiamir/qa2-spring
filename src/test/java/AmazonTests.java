import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTests {
    private final By COMPANY_LOGO = By.id("nav-logo-sprites");
    private final By SEARCH = By.id("twotabsearchtextbox");
    private final By ACCOUNT = By.id("nav-link-accountList-nav-line-1");
    private final By SHOPPING_BASKET = By.id("nav-cart-count-container");
    private final By MENU_ICON = By.id("nav-hamburger-menu");
    private final By BANNER_2 = By.id("desktop-grid-2");

    @Test

    public void AmazonTry() {
        WebDriver browser = new ChromeDriver();
        browser.get("http://amazon.de");

        WebElement logo = browser.findElement(COMPANY_LOGO);
        WebElement search = browser.findElement(SEARCH);
        WebElement account = browser.findElement(ACCOUNT);
        WebElement shopBasket = browser.findElement(SHOPPING_BASKET);
        WebElement all = browser.findElement(MENU_ICON);
        WebElement reklama = browser.findElement(BANNER_2);


    }
}
