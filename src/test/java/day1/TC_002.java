package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import java.util.List;

public class TC_002 {
    protected WebDriver driver;
    @Test
    public void openUrl() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        driver.get("https://www.godigit.com");
        Thread.sleep(2000);
       WebElement element= driver.findElement(By.xpath("(//div[contains(text(),'Travel')])[1]"));
       element.click();
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
