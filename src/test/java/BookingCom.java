import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingCom {
    private final By COMPANY_LOGO = By.xpath(".//div[@class = 'a945757098']");
    private final By CURRENCY = By.xpath(".//span[@class = 'cb5ebe3ffb']");
    private final By AIRPORT_TAXI = By.id("airport_taxis");
    private final By BANNER = By.xpath(".//span[@class ='herobanner-title1']");
    private final By DATE_BTN= By.xpath(".//div[@class='b91c144835']");
    private final By SEARCH_BTN = By.xpath(".//span[@class='e67ffa4eb5']");
    private final By CHECK_BOX = By.xpath(".//div[@class='dfdd8e04de']");
    private final By COVID = By.xpath(".//div[@class='a1b3f50dcd e6f05e293e f7c6687c3d']");
    @Test
    public void BookingTry() {
        WebDriver browser = new ChromeDriver();
        browser.get("http://booking.com");

        WebElement companyLogo = browser.findElement(COMPANY_LOGO);
        WebElement currency = browser.findElement(CURRENCY);
        WebElement airportTaxi = browser.findElement(AIRPORT_TAXI);
        WebElement banner = browser.findElement(BANNER);
        WebElement date = browser.findElement(DATE_BTN);
        WebElement search = browser.findElement(SEARCH_BTN);
        WebElement checkbox = browser.findElement(CHECK_BOX);
        WebElement Covid = browser.findElement(COVID);



    }
}
