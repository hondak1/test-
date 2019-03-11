package tests;

import executors.OnetPage;
import org.junit.BeforeClass;
import org.junit.Test;
import util.SeleniumExecutor;

public class OnetTests {

    private OnetPage onetPage = new OnetPage();

    @BeforeClass
    public static void openOnetPage(){
    SeleniumExecutor.getExecutor();
        SeleniumExecutor.openPage("https://www.onet.pl/");

    }

    @Test
    public void openNewsTest(){

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

    }

}
