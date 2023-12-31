package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage {
    private final By DEPARTURE_SELECT = By.id("afrom");
    private final By ARRIVAL_SELECT = By.id("bfrom");
    private final By GO_BTN = By.xpath(".//span[@class = 'gogogo']");

    private BaseFunc baseFunc;

    public HomePage(BaseFunc baseFunc){
        this.baseFunc = baseFunc;
    }
    public void selectDepartureAirport(String airport) {
        baseFunc.selectByValue(DEPARTURE_SELECT, airport);
    }

    public void selectArrivalAirport(String airport) {
        baseFunc.selectByValue(ARRIVAL_SELECT, airport);
    }

    public void clickGOGOGOBtn(){
        baseFunc.click(GO_BTN);
    }
    }
