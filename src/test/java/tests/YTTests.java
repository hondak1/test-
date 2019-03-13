package tests;

import executors.YTPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import util.SeleniumExecutor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.JVM)

public class YTTests {


    private YTPage onetPage = new YTPage();

    @BeforeClass
    public static void YTPage(){
    SeleniumExecutor.getExecutor();
        SeleniumExecutor.openPage("https://www.youtube.com/?hl=pl&gl=PL");
    }


    @AfterClass
    public static void closeDriver(){
     SeleniumExecutor.closeDriver();
    }


    @Test
    public void Youtube(){ //nazwa testu mowi co bede testowal

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        onetPage.muzyka(); // z tego poziomu jest execution, onet

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    /*@Test
    public void openNewsTest2(){ //nazwa testu mowi co bede testowal

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        onetPage.openNews(); // z tego poziomu jest execution, onet

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        assertTrue("window dont open", onetPage.isTitleClosed());

    }*/



}
