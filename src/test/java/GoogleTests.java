import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTests {
    private final By SEARCH_INPUT = By.id("q");
    private final By SETTINGS = By.xpath(".//span[@class = 'z1asCe E9hVAb']");
    private final By MORE = By.xpath(".//span[@class = 'MbEPDb z1asCe SaPW2b']");
    private final By TOOLS = By.id("hdtb-tls");
    private final By RESULT = By.id("result-stats");
    private final By ABOUT_BTN = By.xpath(".//span[@class = 'xTFaxe z1asCe SaPW2b']");
    private final By BANNER = By.id("_q3RfZLe9CfaTwPAPnput2AI_46");
    @Test
    public void GoogleTry() {
        WebDriver browser = new ChromeDriver();
        browser.get("http://google.com/search?q=google&source=hp&ei=AXBfZKv9B56Xxc8P1ZO3sAo&iflsig=AOEireoAAAAAZF9-Ee9c_hxuXOXBJWALWbvHCNyOh-5t&ved=0ahUKEwjrgbWWlPL-AhWeS_EDHdXJDaYQ4dUDCAg&uact=5&oq=google&gs_lcp=Cgdnd3Mtd2l6EAMyEQguEIAEELEDEIMBEMcBENEDMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCAgAEIAEELEDMggIABCABBCxAzILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATILCAAQgAQQsQMQgwEyCwgAEIAEELEDEIMBOgUIABCABDoRCC4QgwEQxwEQsQMQ0QMQgARQAFj1EGCRR2gBcAB4AIABYIgBjwOSAQE2mAEAoAEB&sclient=gws-wiz");

        browser.findElement(SEARCH_INPUT).sendKeys("Google");

        WebElement search = browser.findElement(SEARCH_INPUT);
        WebElement settings = browser.findElement(SETTINGS);
        WebElement more = browser.findElement(MORE);
        WebElement tools = browser.findElement(TOOLS);
        WebElement about = browser.findElement(RESULT);
        WebElement about_btn  = browser.findElement(ABOUT_BTN);
        WebElement google = browser.findElement(BANNER);
    }
}
