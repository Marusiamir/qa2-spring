import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlvTests {

    private final By BUSINESS = By.xpath(".//a[@class = 'site-top_menu-left-link']");
    private final By RECEIVING = By.xpath(".//a[@class = 'site-top_menu-right-link']");
    private final By LANGUAGE = By.xpath(".//li[@class = 'site-top_menu-right-item language-switcher']");
    private final By LOGO = By.xpath(".//a[@class = 'main-logo']");
    private final By SEARCH_BTN = By.xpath(".//div[@class = 'main-search_submit' ]");
    private final By SHOPPING_BASKET = By.xpath(".//div[@class = 'cart-block']");
    private final By BANNER = By.tagName(".//img[@class = 'smart-net-banner_logo']");
    private final By BANNER_IMAGE = By.tagName(".//img[@class = 'smart-net-banner_image']");
    private final By HANDLE_ICON = By.xpath(".//i[@class = 'main-menu_handle-icon icon-svg']");

    @Test


    public void AlvTry() {
        WebDriver browser = new ChromeDriver();
        browser.get("http://1a.lv");

        WebElement piedavajums = browser.findElement(BUSINESS);
        WebElement sanemsana = browser.findElement(RECEIVING);
        WebElement language = browser.findElement(LANGUAGE);
        WebElement logo = browser.findElement(LOGO);
        WebElement search = browser.findElement(SEARCH_BTN);
        WebElement shopBasket = browser.findElement(SHOPPING_BASKET);
        WebElement smartnet = browser.findElement(BANNER);
        WebElement gifts = browser.findElement(BANNER_IMAGE);
        WebElement all = browser.findElement(HANDLE_ICON);


    }
}