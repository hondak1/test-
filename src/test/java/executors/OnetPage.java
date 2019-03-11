package executors;

import locators.OnetLocators;
import org.openqa.selenium.support.PageFactory;
import util.SeleniumExecutor;

public class OnetPage {

    private OnetLocators locators;

    public OnetPage() { // od 11 do 14 jest konstruktor , pozostaje bez zmian
        locators = new OnetLocators();
        PageFactory.initElements(SeleniumExecutor.getDriver(), locators); //inicjalizuje drivera, page factory pattern
    }

    public void openNews(){ // tu sobie nazywam otworz np cos tam (page summary)
        locators.news.click(); // kazda akcja osobno dla kazdego lokatora, czyli nowy void
    }

}
