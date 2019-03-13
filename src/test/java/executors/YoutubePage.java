package executors;

import locators.YTLocators;
import locators.YoutubeLocators;
import org.openqa.selenium.support.PageFactory;
import util.SeleniumExecutor;

public class YoutubePage {

    private YoutubeLocators locators;

    public YoutubePage() {
        locators = new YoutubeLocators();
        PageFactory.initElements(SeleniumExecutor.getDriver(), locators);
    }

    public void sport(){
        locators.sport.click();
    }

}
