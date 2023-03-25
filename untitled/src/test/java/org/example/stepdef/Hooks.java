package org.example.stepdef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Hooks {

    public static WebDriver driver;
    @Before
    public static void openBrowser()
    {
        //1-Bridge between your code and your browser using webdriver dependecy
      /*  WebDriverManager.chromedriver().setup();

        //2-Create new object from chromeDriver
        driver= new ChromeDriver();*/

        WebDriverManager.chromedriver().setup();

        ChromeOptions  options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);

        //3- Configuration
        //3.1- Maximize browser
        driver.manage().window().maximize();
        //3.2- set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //4- Navigate to website
        driver.navigate().to("https://demo.nopcommerce.com");
    }

    @After
    public static void quitDriver() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.quit();
    }
}
