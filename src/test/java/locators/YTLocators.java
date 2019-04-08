package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YTLocators {

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Music')]") // dla kazdego kliku osobne find by
    public WebElement muzyka;//pod news kryje sie wiadomosci i tak kazdy element

}



