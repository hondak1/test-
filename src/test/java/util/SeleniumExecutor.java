package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumExecutor {

    private static WebDriver driver;

    private static SeleniumExecutor executor;

    public SeleniumExecutor() {

        driver = createDriver();

    }

    private static void startExecutor(){ // jedno = przypisanie a dwa porownanie

        if(executor==null){

            executor = new SeleniumExecutor();
        }
    }

    public static SeleniumExecutor getExecutor(){

        startExecutor();
        return executor;
    }

    public static WebDriver getDriver() {

        return driver;

    }

    private static WebDriver createDriver (){

        System.setProperty("webdriver.chrome.driver", "C:/chromedriver/chromedriver.exe");

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        return driver;
    }

    public static void openPage(String url){      //jak jest zwykla to odnosisz sie przez referncje a jak statyczna tyo przez nazwe klasy bezposrednio

        try { //proboje otworyc streone a jak sie nie uda to przechwytuje blad i ten lad jest zapisany w e i wydrukuje w konsoli

            driver.navigate().to(url); //przkezuje referencje z metody


        }catch (Exception e){

            System.out.println(e);

        }

    }
}

