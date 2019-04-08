package tests;

import executors.YTPage;
import executors.YoutubePage;
import junit.framework.TestCase;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import util.SeleniumExecutor;

import static junit.framework.TestCase.fail;


//@RunWith(JUnit4.class)
public class TestYouTube extends TestCase {

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
    public void testYoutube(){

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
    fail("dupa");
    }
}
