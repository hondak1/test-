package executors;

import locators.YTLocators;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import util.SeleniumExecutor;

public class YTPage {

    private YTLocators locators;

    public YTPage() { // od 11 do 14 jest konstruktor , pozostaje bez zmian
        locators = new YTLocators();
        PageFactory.initElements(SeleniumExecutor.getDriver(), locators); //inicjalizuje drivera, page factory pattern
    }

    public void muzyka(){ // tu sobie nazywam otworz np cos tam (page summary)
        locators.muzyka.click(); // kazda akcja osobno dla kazdego lokatora, czyli nowy void
    }

    /*public boolean isTitleClosed(){ //typ danych zwraca prawde albo falsz

       return locators.news2.isDisplayed(); // sprawdzi czy lokator sie wsyswietla , jak nie to false
}

    public void myszkaidle(){
        Actions action = new Actions(SeleniumExecutor.getDriver());
        action.moveToElement(locators.myszkaidle).perform();


    }*/
}

