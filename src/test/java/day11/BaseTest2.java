package day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest2 {

        public static WebDriver driver;
        @BeforeClass
        public void openUrl(){
            ChromeOptions o = new ChromeOptions();
            o.addArguments("--disable-notifications");
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
            driver.manage().window().maximize();
        }
}
