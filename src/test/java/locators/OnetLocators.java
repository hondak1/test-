package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OnetLocators {

    @FindBy(how = How.XPATH, using = "[contains(text()='Wiadomości')]") // dla kazdego kliku osobne find by
    public WebElement news;//pod news kryje sie wiadomosci i tak kazdy element

    @FindBy(how = How.XPATH, using = "[contains(text()='Wiadomości')]")
    public WebElement news2;
}



