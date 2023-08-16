import model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TicketsTests {
    private final By FROM = By.id("afrom");
    private final By TO = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");
    private final By BOOK_BTN = By.id("book2");

    private final By SELECTED_AIRPORT = By. xpath(".//span[@class = 'bTxt']");
    private final By NAME_INPUT = By.id("name");
    private final By SURNAME_INPUT = By.id("surname");
    private final By DISCOUNT_CODE_INPUT = By.id("discount");
    private final By SOMEONE_ELSE_INPUT = By.id("adults");
    private final By CHILDREN_INPUT = By.id("children");
    private final By LUGGAGE_INPUT = By.id("bugs");
    private final By NEXT_FLIGHT = By.id("11-05-2018");
    private final By GET_PRICE_LINK = By.id("price");
    private final By FLIGHT_INFO = By.id("flight");



    private final String URL = "http://www.qaguru.lv:8089/tickets";
    private final String DEPARTURE_AIRPORT = "RIX";
    private final String ARRIVAL_AIRPORT = "MEL";

    private final String NAME = "Marianna";
    private final String SURNAME = "Malere";
    private final String DISCOUNT_CODE = "no";
    private final String SOMEONE_ELSE = "0";
    private final String CHILDREN = "0";
    private final String LUGGAGE = "1";
    private final String FLIGHT = "11-05-2018";

    @Test
    public void successTicketsBookCheck() {
        //Open browser
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();

        //Open Home Page
        browser.get(URL);

        //Select Departure airport;
        WebElement fromDropdown = browser.findElement(FROM);
        Select fromSelect = new Select(fromDropdown);
        fromSelect.selectByValue(DEPARTURE_AIRPORT);

        //Select Arrival airport
        WebElement toDropdown = browser.findElement(TO);
        Select toSelect = new Select(toDropdown);
        toSelect.selectByValue(ARRIVAL_AIRPORT);

        //Press GoGoGo btn
        browser.findElement(GO_BTN).click();

        //Check if selected airport appears
        List<WebElement> selectedAirports  = browser.findElements(SELECTED_AIRPORT);
        System.out.println("First airport" + selectedAirports.get(0).getText());
        System.out.println("Second airport" + selectedAirports.get(1).getText());

        //Fill in passenger personal info
        WebElement nameInputField = browser.findElement(NAME_INPUT);
        nameInputField.clear();
        nameInputField.sendKeys(NAME);

        WebElement surnameInputField = browser.findElement(SURNAME_INPUT);
        surnameInputField.clear();
        surnameInputField.sendKeys(SURNAME);

        WebElement discountCodeInputField = browser.findElement(DISCOUNT_CODE_INPUT);
        discountCodeInputField.clear();
        discountCodeInputField.sendKeys(DISCOUNT_CODE);

        WebElement adultInputField = browser.findElement(SOMEONE_ELSE_INPUT);
        adultInputField.clear();
        adultInputField.sendKeys(SOMEONE_ELSE);

        WebElement childrenInputField = browser.findElement(CHILDREN_INPUT);
        childrenInputField.clear();
        childrenInputField.sendKeys(CHILDREN);

        WebElement luggageInputField = browser.findElement(LUGGAGE_INPUT);
        luggageInputField.clear();
        luggageInputField.sendKeys(LUGGAGE);

        WebElement DateDropDown = browser.findElement(NEXT_FLIGHT);
        Select fromselect = new Select(DateDropDown);
        fromselect.selectByValue(FLIGHT);

        List<WebElement> selectedDates  = browser.findElements(NEXT_FLIGHT);
        System.out.println("Date" + selectedDates.get(0).getText());


        //Press Get Price link
        browser.findElement(GET_PRICE_LINK).click();

        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.numberOfElementsToBe(FLIGHT_INFO, 5));

        List<WebElement> flightInfo = browser.findElements(FLIGHT_INFO);
        Assertions.assertEquals(DEPARTURE_AIRPORT,flightInfo.get(0).getText(), "Wrong Departure Airport");
        Assertions.assertEquals(ARRIVAL_AIRPORT,flightInfo.get(1).getText(), "Wrong arrival airport");
        Assertions.assertEquals(NAME,flightInfo.get(2).getText(), "Wrong name");
        Assertions.assertEquals(DEPARTURE_AIRPORT,flightInfo.get(3).getText(), "Wrong Departure Airport");
        Assertions.assertEquals(ARRIVAL_AIRPORT,flightInfo.get(4).getText(), "Wrong arrival airport");

        //Press Book btn
        browser.findElement(BOOK_BTN).click();

        //Select seat Nr
        //Press Book btn
        //Check if successful message appears
    }
}
