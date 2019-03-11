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
    public void openNewsTest(){ //nazwa testu mowi co bede testowal

        //zaczynam onet test i sobie opisuje co ten test ma robic, pozniej locator, i na koncyui onet page , void moga miec te same nazwy lepiej roznie

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

    @Test
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

    }



}
