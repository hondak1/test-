package tests;

import executors.YTPage;
import executors.YoutubePage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import util.SeleniumExecutor;

public class YoutubeTests {

    private YoutubePage YoutubePage = new YoutubePage();

    @BeforeClass
    public static void YoutubeTests(){
        SeleniumExecutor.getExecutor();
        SeleniumExecutor.openPage("https://www.youtube.com/?hl=pl&gl=PL");
    }

    @AfterClass
    public static void closeDriver(){
        SeleniumExecutor.closeDriver();
    }


    @Test
    public void Youtube(){

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        YoutubePage.sport();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
