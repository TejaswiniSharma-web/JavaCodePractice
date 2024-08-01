package ASSESSMENT;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseTest {

    public WebDriver driver;
    @BeforeClass
    public void openUrl(){
        ChromeOptions o = new ChromeOptions();
        o.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver(o);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        driver.manage().window().maximize();
    }
 /*   @AfterClass
    public void closeBrowser(){
        driver.close();
    }*/
}
