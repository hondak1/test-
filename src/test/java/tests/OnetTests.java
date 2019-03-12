package tests;

import executors.OnetPage;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import util.SeleniumExecutor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.JVM)

public class OnetTests {


    private OnetPage onetPage = new OnetPage();

    @BeforeClass
    public static void openOnetPage(){
    SeleniumExecutor.getExecutor();
        SeleniumExecutor.openPage("https://www.onet.pl/");

    }



    @AfterClass
    public static void closeDriver(){

     SeleniumExecutor.closeDriver();

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

        assertTrue("window dont open", onetPage.isTitleClosed());

    }



}
