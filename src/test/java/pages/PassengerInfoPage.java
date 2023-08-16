package pages;

import model.ReservationInfo;
import org.openqa.selenium.By;

public class PassengerInfoPage {
    private final By NAME_INPUT = By.id("name");
    private final By SURNAME_INPUT = By.id("surname");
    private final By DISCOUNT_CODE_INPUT = By.id("discount");
    private final By SOMEONE_ELSE_INPUT = By.id("adults");
    private final By CHILDREN_INPUT = By.id("children");
    private final By LUGGAGE_INPUT = By.id("bugs");
    private final By NEXT_FLIGHT = By.id("flight");
    private final By GET_PRICE_LINK = By.xpath(".//span[@onclick = 'setLang();']");
    private final By FLIGHT_INFO = By.xpath(".//span[@class = 'bTxt']");

    private BaseFunc baseFunc;

    public PassengerInfoPage(BaseFunc baseFunc) {
        this.baseFunc = baseFunc;
    }

    public void fillInPassengerInfo(ReservationInfo reservationInfo) {
baseFunc.type(NAME_INPUT, reservationInfo.getFirstName());
baseFunc.type(SURNAME_INPUT,reservationInfo.getLastName());
baseFunc.type(DISCOUNT_CODE_INPUT,reservationInfo.getDiscount());
baseFunc.type(SOMEONE_ELSE_INPUT,reservationInfo.getPassengerCount());
baseFunc.type(CHILDREN_INPUT, reservationInfo.getChildCount());
baseFunc.type(LUGGAGE_INPUT,reservationInfo.getBagsCount());
baseFunc.selectByText(FLIGHT_INFO,reservationInfo.getFlightDate());
    }

    public String getDepartureAirport() {
        String airport = "";
        //finding element by locator
        //getting text
        return airport;
    }
}
