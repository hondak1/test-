package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YoutubeLocators {

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Sport')]") // dla kazdego kliku osobne find by
    public WebElement sport;//pod news kryje sie wiadomosci i tak kazdy element

}
